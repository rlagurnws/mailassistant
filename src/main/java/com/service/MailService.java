package com.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.Entity.Content;
import com.dto.Body;
import com.dto.DocumentObject;
import com.dto.OptionObject;
import com.dto.ResponseDTO;
import com.repository.ContentRepository;
import com.repository.MailRepository;
import com.repository.PersonRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class MailService {

	private final MailRepository mailRepository;
	private final PersonRepository personRepository;
	private final ContentRepository contentRepository;
	private ModelMapper mapper = new ModelMapper();
	
	
	public List<ResponseDTO> getMailList(){
		List<ResponseDTO> list = mailRepository.findAll().stream().map(e -> mapper.map(e, ResponseDTO.class)).collect(Collectors.toList());
		
		list.forEach(e -> fill(e));
		return list;
	}
	
	public void fill(ResponseDTO dto) {
		Content temp = contentRepository.findById(dto.getMail_id()).get();
		
		dto.setSenderName(personRepository.findById(dto.getSender()).get().getName());
		dto.setReceiverName(personRepository.findById(dto.getReceiver()).get().getName());
		dto.setEmail(personRepository.findById(dto.getSender()).get().getEmail());
		dto.setContent(temp.getContent());
		dto.setSubject(temp.getSubject());
		dto.setTime(temp.getTime());
	}
	
	
	public String getSummery(String num) {
		
		log.info("메일 요약 시~~~작!");
		
		String[] arr = num.split(",");
		StringBuilder sb = new StringBuilder();
		
		for(String s : arr) {
			sb.append(sendPost(s));
			sb.append("<br/><br/><br/><br/>");
		}
		
		return sb.toString();
	}
	
	public String sendPost(String str) {
		log.info("POST 시작~~~~~~~~~~~~");
		Content content = contentRepository.findById(Integer.parseInt(str)).get();
		
		Body body = Body.builder()
				.document(DocumentObject.builder().title(content.getSubject()).content(content.getContent()).build())
				.option(new OptionObject())
				.build();
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-NCP-APIGW-API-KEY-ID", "xuylakzwzg");
		headers.add("X-NCP-APIGW-API-KEY", "vleAqrfGos1lUaTriGj18FCIoXjlwnxEUyxPRvF1");
		headers.add("Content-Type", "application/json");
		
		HttpEntity<Body> entity = new HttpEntity<>(body, headers);
		
		log.info(entity.toString());
		
		RestTemplate rt = new RestTemplate();

		ResponseEntity<String> response = rt.exchange(
		                "https://naveropenapi.apigw.ntruss.com/text-summary/v1/summarize",
		                HttpMethod.POST,
		                entity,
		                String.class
		);
		
		log.info("요약 내용 : "+response.getBody());
		return response.getBody();
	}
	
	
}

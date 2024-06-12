package com.service;

import java.util.ArrayList;
import java.util.List;

import com.Entity.Content;
import com.Entity.Mail;
import com.Entity.Person;
import com.repository.ContentRepository;
import com.repository.MailRepository;
import com.repository.PersonRepository;

import lombok.RequiredArgsConstructor;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class InitService {

	private final PersonRepository personRepository;
	private final MailRepository mailRepository;
	private final ContentRepository contentRepository;
	
	public void PersonInit() {
		
		List<Person> list = new ArrayList<>();
		
		list.add(Person.builder().name("김혁준").email("faker@woorifis.com").build());
		list.add(Person.builder().name("서지오").email("deft@woorifis.com").build());
		list.add(Person.builder().name("송지현").email("zeus@woorifis.com").build());
		list.add(Person.builder().name("유영민").email("gumayusi@woorifis.com").build());
		list.add(Person.builder().name("유주현").email("keria@woorifis.com").build());
		list.add(Person.builder().name("최다정").email("kkoma@woorifis.com").build());
		list.add(Person.builder().name("최하성").email("wolf@woorifis.com").build());
		
		personRepository.saveAll(list);
	}
	
	public void MailInit() {
		
		List<Mail> list = new ArrayList<>();
		
		list.add(Mail.builder().sender(7).receiver(1).build());
		list.add(Mail.builder().sender(6).receiver(1).build());
		list.add(Mail.builder().sender(2).receiver(1).build());
		list.add(Mail.builder().sender(3).receiver(1).build());
		list.add(Mail.builder().sender(4).receiver(1).build());
		list.add(Mail.builder().sender(5).receiver(1).build());
		list.add(Mail.builder().sender(6).receiver(1).build());
		list.add(Mail.builder().sender(7).receiver(1).build());
		list.add(Mail.builder().sender(4).receiver(1).build());
		list.add(Mail.builder().sender(5).receiver(1).build());
		
		mailRepository.saveAll(list);
	}
	
	public void ContentInit() {
		
		List<Content> list = new ArrayList<>();
		
		list.add(Content.builder().mail_id(1).subject("내가 애국가 1절을 알려줄게 ").content("동해물과 백두산이 마르고 닳도록\r\n"
				+ "하느님이 보우하사 우리나라 만세\r\n"
				+ "무궁화 삼천리 화려 강산\r\n"
				+ "대한 사람 대한으로 길이 보전하세").time("2024-06-11 13:08:32").build());
		
		list.add(Content.builder().mail_id(2).subject("내가 애국가 2절을 알려줄게 ").content("남산 위에 저 소나무 철갑을 두른 듯\r\n"
				+ "바람 서리 불변함은 우리 기상일세\r\n"
				+ "무궁화 삼천리 화려 강산\r\n"
				+ "대한 사람 대한으로 길이 보전하세").time("2024-06-11 13:10:22").build());
		
		list.add(Content.builder().mail_id(3).subject("메일 내용을 요약해봅시다.").content("다음 달 1일부터 000등 소주 제품 공장 출고가격이 인상된다. 000는 00와 00(360㎖)의 공장 출고가격을 병당 1천15.7원에서 1천81.2원으로 65.5원(6.45%) 올린다고 24일 밝혔다. 000가 소주 가격을 인상한 것은 2015년 11월 이후 3년 5개월 만이다. 회사 관계자는 \"원부자재 가격, 제조경비 등 원가 상승요인이 발생했다\"면서 \"3년여간 누적된 인상요인이 10% 이상 발생했으나, 원가절감 노력 등을 통해 소비자들의 부담을 최소화하는 선에서 인상률을 결정했다\"고 설명했다. 공장 출고가 이렇게 인상되면서 소매점과 식당의 가격인상이 불가피해질 전망이다. 주류업계에서는 00 소주 출고가가 65.5원 오르면 대형할인점 등에서는 소매 가격을 100원 안팎 올릴 것으로 보고 있다. 식당과 주점에서는 이미 소주 1병에 5천원을 받는 곳이 나타나기 시작했다. 현재 서울의 식당, 주점에서는 보통 소주 1병에 4천∼4천500원을 받는다. 주류 가격은 이미 몇달 전부터 들썩였다. 맥주 시장 1위인 000맥주는 이달 초 주요 제품 출고가를 평균 5.3% 올렸다. 000맥주의 `00`, `00`, `00` 등 주요 맥주 제품의 공장 출고가가 평균 5.3% 인상됐다. 간판 제품인 `00` 병맥주 500㎖의 출고가는 1천147원에서 1천203.22원으로 56.22원(4.9%) 올랐다. 위스키 업계에서도 1위 업체인 0000가 최근 주요 제품 가격을 평균 8% 올리는 등 가격 인상 조짐이 나타나고 있다.").time("2024-06-11 13:14:11").build());
		
		list.add(Content.builder().mail_id(4).subject("잔나비 - 외딴섬 로맨틱").content("어느 외딴섬 로맨틱을\r\n"
				+ "		우리 꿈꾸다 떠내려 왔나\r\n"
				+ "		때마침 노을빛이 아름답더니\r\n"
				+ "		캄캄한 밤이 오더군\r\n"
				+ "		이대로 이대로\r\n"
				+ "		더 길 잃어도 난 좋아\r\n"
				+ "		노를 저으면 그 소릴 난 들을래\r\n"
				+ "		쏟아지는 달빛에\r\n"
				+ "		오 살결을 그을리고\r\n"
				+ "		먼 옛날의 뱃사람을 닮아볼래 그 사랑을\r\n"
				+ "		나는 처음부터 다 알고 있었지\r\n"
				+ "		거긴 그 무엇도 없다는 것을\r\n"
				+ "		그래 넌 두 눈으로 꼭 봐야만 믿잖아\r\n"
				+ "		기꺼이 함께 가주지\r\n"
				+ "		이대로 이대로\r\n"
				+ "		더 길 잃어도 난 좋아\r\n"
				+ "		노를 저으면 그 소릴 난 들을래\r\n"
				+ "		쏟아지는 달빛에\r\n"
				+ "		오 살결을 그을리고\r\n"
				+ "		먼 옛날의 뱃사람을 닮아볼래\r\n"
				+ "		사랑은 바다 건너 피는 꽃이 아니래\r\n"
				+ "		조그만 쪽배에로\r\n"
				+ "		파도는 밑줄 긋고\r\n"
				+ "		먼 훗날 그 언젠가\r\n"
				+ "		돌아가자고 말하면\r\n"
				+ "		너는 웃다 고갤 끄덕여줘\r\n"
				+ "		참 아름다운 한때야\r\n"
				+ "		오 그 노래를 들려주렴\r\n"
				+ "		귓가에 피어날 사랑 노래를").time("2024-06-12 02:10:12").build());
		
		
		list.add(Content.builder().mail_id(5).subject("벤슨? Beautiful Things").content("워싱턴 주 먼로에서 5남매 중 유일한 아들로 자란 분은 이전에 노래 경험이 없었음에도 불구하고 고등학교 3학년 때 친구가 노래를 부탁했는데 그 때 보컬 재능을 처음 발견하게 된다.\r\n"
				+ "\r\n"
				+ "그 후 틱톡에 노래하는 영상을 게시하기 시작한 그는 2021년 초 친구의 추천으로 아메리칸 아이돌 시즌 19 오디션을 봤고 할리우드 위크에 초대까지 받았지만, 자신의 커리어를 고려하여 쇼에서 하차했다. 170만 팔로워를 확보한 그는 첫 번째 싱글 \"Ghost Town\"을 2021년 10월 15일에 발매했다. 음원에서 드럼, 기타 및 피아노를 연주함은 물론 싱글 삽화까지 디자인했다. 그 결과 'Ghost Town'으로 미국 등 13개국 차트 1위를 기록했다.\r\n"
				+ "\r\n"
				+ "2022년 2월 18일, 두 번째 싱글 \"ROOM FOR 2\"를 발표했다.").time("2024-06-12 03:10:07").build());
		list.add(Content.builder().mail_id(6).subject("위험감지 CCTV 프로그래밍 개요").content("본 논문은 일반 CCTV 에서 특정 상황이 촬영될 경우 알림을 보내 위험한 상황에서 즉각\r\n"
				+ "대응할 수 있는 시스템을 제안하고 있다. 제안하는 시스템에서는 OpenCV 의 Multi Pose\r\n"
				+ "Estimation 과 Tracking API 를 사용하여 촬영중인 영상에서 사람이 넘어졌을 경우, 양 손을\r\n"
				+ "든 자세를 취하는 경우, 여럿이 동시에 뛰어가는 경우에 IFTTT 서비스를 이용하여 휴대폰으로\r\n"
				+ "메시지를 전송하도록 하였다. 이를 통해 시스템은 영상에서 위험한 상황이 발생했을 경우\r\n"
				+ "알림을 보내 빠른 조치를 취할 수 있게 돕는다. 시스템 검증을 위한 실험에서 제안하는\r\n"
				+ "시스템은 양 손을 든 자세를 취하는 경우, 사람이 넘어졌을 경우, 여럿이 동시에 뛰어가는\r\n"
				+ "경우 세가지 경우 모두 검출하였고, 지정해둔 번호로 위험을 알리는 메시지를 보내는 동작을\r\n"
				+ "수행하였다.").time("2024-06-12 09:10:55").build());
		list.add(Content.builder().mail_id(7).subject("영민이형 이거 제목은 페이크에요").content("CCTV 의 역할은 특정 상황이 발생하고 난 후\r\n"
				+ "나중에 상황을 다시 확인하기 위한 영상을\r\n"
				+ "촬영하는 것이다. 하지만 사람이 쓰러지거나,\r\n"
				+ "위협을 받거나, 화재가 났을 경우 등 빠른\r\n"
				+ "조치를 취할 필요가 있는 상황에서는 크게\r\n"
				+ "도움이 되지 않는다. CCTV 가 스스로 위험한\r\n"
				+ "상황을 판단하고 알림을 보낼 수 있다면\r\n"
				+ "긴급한 상황에서의 빠른 대처가 가능할것이다. 따라서 그러한 시스템의 도입이\r\n"
				+ "필요하다.\r\n"
				+ "따라서 본 논문에서는 OpenCV 를 사용하여\r\n"
				+ "위험을 감지하는 CCTV 를 제안하고 있다. 다음\r\n"
				+ "장에서는 시스템의 구성에 대해서 설명한다.\r\n"
				+ "제 3 장에서는 시스템의 동작 알고리즘에\r\n"
				+ "대해서 설명하고, 제 4 장에서 본 연구에 대한\r\n"
				+ "결론을 정리한다.\r\n"
				+ "").time("2024-06-12 09:13:12").build());
		list.add(Content.builder().mail_id(8).subject("메일 요약 테스트 건").content("일반적인 CCTV 카메라에서 적용 가능하도록\r\n"
				+ "구성이 가능하며, 현재는 미리 촬영한\r\n"
				+ "동영상을 이용하여 테스트를 진행했다. 영상\r\n"
				+ "입력부, 영상 검출부로 구성되었으며 영상\r\n"
				+ "검출부에서는 OpenCV Multi pose\r\n"
				+ "Estimation 과 Tracking API 를 이용하여 검출과\r\n"
				+ "IFTTT 를 이용한 알림을 보내는 시스템을\r\n"
				+ "구현할 수 있다.\r\n"
				+ "Multi Pose Estimation 을 이용하여 사람의\r\n"
				+ "신체부위를 검출하고 검출된 신체부위 사이의\r\n"
				+ "유효한 쌍을 찾아 동일한 사람에 속하는\r\n"
				+ "신체부위를 찾고 리스트에 저장한 후 이를\r\n"
				+ "이용하여 사람의 특정 자세를 추정할 수 있다.\r\n"
				+ "영상 내의 사람의 위치 변화를 계산하기\r\n"
				+ "위해 검출된 신체부위를 이용하여 사람마다\r\n"
				+ "관심영역을 지정해주고 Tracking API 를 통해\r\n"
				+ "영상 내의 관심영역이 이동한다. 관심영역의\r\n"
				+ "중심 좌표의 변화를 이용하여 여러 사람의\r\n"
				+ "위치 변화를 계산한다. 이를 통해 여럿이\r\n"
				+ "달려가는 경우를 검출할 수 있다.\r\n"
				+ "특정 상황을 검출한 경우 IFTTT 서비스를\r\n"
				+ "이용하여 미리 지정해둔 동작을 실행시킬 수\r\n"
				+ "있는 URL 을 Request 하여 알림을 보낼 수\r\n"
				+ "있다.").time("2024-06-12 09:15:22").build());
		list.add(Content.builder().mail_id(9).subject("메일 요약 테스트 건2").content("본 논문에서는 OpenCV 를 이용한\r\n"
				+ "위험 감지 CCTV 시스템 설계 방법에\r\n"
				+ "대해 소개하고 있다. Python 을 사용한\r\n"
				+ "OpenCV 를 통해 Multi Pose\r\n"
				+ "Estimation 과 Tracking API 를 이용하여\r\n"
				+ "사람의 특정 자세, 여럿이 뛰어가는\r\n"
				+ "경우를 검출한다. 검출이 된 경우\r\n"
				+ "IFTTT 를 통해 사용자에게 알림을\r\n"
				+ "보내는 동작을 확인했다. 이를 통해\r\n"
				+ "촬영중인 CCTV 영상에 위험한 상황이\r\n"
				+ "발생했을 경우 빠른 대처를 취할 수\r\n"
				+ "있다. 영상 처리 속도를 높이고, 더\r\n"
				+ "정확한 계산과 높은 인식률을 구현할\r\n"
				+ "수 있다면 더 많은 위급상황을\r\n"
				+ "인식하고 대처할 수 있을 것으로\r\n"
				+ "기대된다.\r\n"
				+ "").time("2024-06-12 09:17:36").build());
		list.add(Content.builder().mail_id(10).subject("메일 요약 테스트 건3").content("1. 인터페이스(interface)\r\n"
				+ "추상 클래스보다 추상화 정도가 더 높은 추상 클래스\r\n"
				+ "\r\n"
				+ "추상 클래스는 구현부를 갖춘 일반 메서드나 변수도 가질 수 있지만,\r\n"
				+ "\r\n"
				+ "인터페이스는 추상메서드와 상수만을 멤버로 가질 수 있음\r\n"
				+ "\r\n"
				+ "인터페이스 역시 다른 클래스로부터 해당 인터페이스(미완성 설계도)구현을 요구하는 목적으로 사용되며, 그 자체만으로 사용되진 않음\r\n"
				+ "\r\n"
				+ "2. 인터페이스 작성 방식\r\n"
				+ "클래스를 작성할 때는 키워드로 class를 사용했음\r\n"
				+ "인터페이스를 작성할 때는 키워드로 class 대신 interface 를 사용\r\n"
				+ "\r\n"
				+ "interface 인터페이스명 {\r\n"
				+ "  public static final 타입 상수이름 = 값;\r\n"
				+ "  public abstract 메서드명(매개변수 목록);\r\n"
				+ "}\r\n"
				+ "2-1. 인터페이스의 작성 규칙\r\n"
				+ "모든 멤버 상수는 public static final로 지정해야 하며, 생략하면 컴파일러가 자동으로 추가해줌\r\n"
				+ "모든 메서드는 public abstract 이어야 하며, 이 역시 생략 가능\r\n"
				+ "interface PlayingCard {\r\n"
				+ "		public static final int SPADE = 4;\r\n"
				+ "		final int DIAMOND = 3;\r\n"
				+ "		static int HEART = 2;\r\n"
				+ "		int CLOVER = 1;\r\n"
				+ "		\r\n"
				+ "		public abstract String getCardNumber();\r\n"
				+ "		String getCardKind();\r\n"
				+ "}\r\n").time("2024-06-12 13:10:20").build());
		
		contentRepository.saveAll(list);
	}
	
}

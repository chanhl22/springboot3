package com.example.springboot3.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class LargeData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "LONGTEXT")
    private String data;

    public LargeData(String data) {
        this.data = data;
    }

    public static LargeData create() {
        return new LargeData("""
                {
                  "data_id": "helpbiz_163653",
                  "content": "안녕하세요.  법원의 포괄적 금지명령공고 효력 적용 여부 에 대하여 문의 드립니다.\\r\\n당사는  상거래 채무자 A 가 기일내 변제를 하지 않아  제 3채무자B 채권에  대하여 압류절차를\\r\\n실행하여24.12.월 초에  법원의 압류결정문 을 받아  B에게  압류 결정문및 추심명령 을  24년 12월 초순 통지  하였으나,현재 까지 B 가 추심명령을 이행하고 있지 않은 상태에서 A가 24년 12월 26일 기업회생신청 결정으로\\r\\n회생법원의 포괄적 금지명령 공고문을 접수 하였습니다. \\r\\n- 공고문 -\\r\\n이 사건에 관하여 회생절차의 개시신청에 대한 결정이 있을 때까지, 모든 회생채권자 및 회생담보권자에 대하여 회생채권 또는 회생담보권에 기한 강제집행, 가압류, 가처분 또는 담보권실행을 위한 경매절차를 금지한다.\\r\\n\\r\\n문의) 1),당사의경우 법원 포괄적 금지명령이전일에   압류결정 및 추심명령을 이행 하였기에 제 3채무자 B채권\\r\\n            에 는  영향이  있는지?  없는지요?  \\r\\n         2) 위 1 영향에 따른 당사의 대응 절차는 어떻게 해야 하는것인지요?",
                  "reply_content": "안녕하십니까? 코참경영상담센터 전문위원 조성곤 입니다.\\r\\n\\r\\n\\r\\n1. 연락처로  통화가 되지 않습니다.\\r\\n\\r\\n2. 포괄적 금지명령은 회생채권 또는 회생담보권에 기한 강제집행등의 금지를 명하는 것입니다.\\r\\n\\r\\n  이 경우 금지명령 전에 압류 및 추심명령을 받았다 하더라도 포괄적 금지명령의 효력을 받게 되어 강제집행을 실핼할 수 없게 됩니다.\\r\\n\\r\\n3. 제 3 채무자의 채권이 회생절차에 포함되지 않은 채권인 경우 위 사정에도 불구하고 제 3채무자는 이러한 사정을 알 수 없고, 제 3채무자의 채권을 추심하더라도 최생절차에 영향을 미치지 않으므로 귀 사에서 일방적으로 추심하여 채권의 만족을 얻을 가능성도 있습니다. \\r\\n\\r\\n 다만 이 경우에도 채무자회사에서 회생절차를 통하여 해당채권을 회생절차에 신고하고 중지를 신청하는 경우 동일하게 추심이 불가능하게 될 수 있습니다.\\r\\n\\r\\n4. 제 3채무자의 채권이 회생절차에 포함된 경우라면 포괄적 금지명령 자체에 이의를 신청하는 방법이 있으나 실무적으로 받아 들여지기는 매우 어렵습니다.\\r\\n\\r\\n 업무에 참고하시기 바랍니다.\\r\\n\\r\\n\\r\\n추가 문의가 있으시면 전화 1600-1572, 코참넷(www.korcham.net) 코참경영상담센터로 문의 주시면 됩니다.\\r\\n감사합니다."
                }""");
    }

}

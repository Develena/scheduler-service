package com.nuri.scheduler.store.jpo;

import com.nuri.scheduler.entity.Dcu;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/* Domain 에 정의된 DCU entity를 DB 작업을 위한 jpo 로 변환해서 사용. */
/* Cdo : Create용 객체, Sdo : Search용 객체 */
@Getter
@Setter
@NoArgsConstructor
public class DcuJpo {

    private String dcuId; // id
    private String ip;
    private Integer port;
    private String nameSpace;
    private String dcuStatus;

    public DcuJpo(Dcu dcu) {
        if(dcu != null) {
            this.dcuId = dcu.getDcuId();
            this.ip = dcu.getIp();
            this.port = dcu.getPort();
            this.nameSpace = dcu.getNameSpace();
            this.dcuStatus = dcu.getDcuStatus();
        }
    }

    public Dcu toDomain() {
        Dcu dcu = new Dcu();
        dcu.setDcuId(this.dcuId);
        dcu.setIp(this.ip);
        dcu.setPort(this.port);
        dcu.setNameSpace(this.nameSpace);
        dcu.setDcuStatus(this.dcuStatus);
        return dcu;
    }
}

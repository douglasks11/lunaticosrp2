package lunaricosRP.models;

import javax.persistence.*;

@Entity
@Table(name = "servidorfront")
public class servidorOnline {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_server")
    private Long id;

    @Column(name = "name_server")
    private String serverName;

    @Column(name = "descricao_server", length = 200)
    private String serverDescription;

    @Column(name = "ip_server")
    private String serverIP;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getServerDescription() {
        return serverDescription;
    }

    public void setServerDescription(String serverDescription) {
        this.serverDescription = serverDescription;
    }

    public String getServerIP() {
        return serverIP;
    }

    public void setServerIP(String serverIP) {
        this.serverIP = serverIP;
    }


}

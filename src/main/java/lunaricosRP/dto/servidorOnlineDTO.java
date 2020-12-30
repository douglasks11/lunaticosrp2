package lunaricosRP.dto;

import lunaricosRP.models.servidorOnline;

public class servidorOnlineDTO {

    private String serverName;

    private String serverDescription;

    private String serverIP;

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

    public servidorOnline doToEntity(){
        servidorOnline newServer = new servidorOnline();
        newServer.setId(null);
        newServer.setServerName(this.getServerName());
        newServer.setServerDescription(this.getServerDescription());
        newServer.setServerIP(this.getServerIP());
        return newServer;
    }
}

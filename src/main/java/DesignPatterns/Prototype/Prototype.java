package DesignPatterns.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Prototype implements Cloneable{
    // consider below data is fetch from network
    private String ip;
    private  String data;
    private List<String> domains = new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public void loadImpData() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted");
        }
        this.data = "Very imp data";
        domains.add("ABC");
        domains.add("DEF");
        domains.add("GHI");
        domains.add("JKL");
        // this will take time to load
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "ip='" + ip + '\'' +
                ", data='" + data + '\'' +
                ", domains=" + domains +
                '}';
    }

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        Prototype prototype = new Prototype();
        prototype.setIp(ip);
        prototype.setData(data);
        this.getDomains().stream().forEach(domain -> prototype.domains.add(domain));
        return prototype;
    }


}

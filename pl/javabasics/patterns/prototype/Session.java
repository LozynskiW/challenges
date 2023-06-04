package pl.javabasics.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

class Session implements  Cloneable{

    private List<String> users;
    private int ram;

    public Session(List<String> users, int ram) {

        this.users = users;
        this.ram = ram;
    }

    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public Session clone() {

        List<String> users = new ArrayList<>(this.users);

        return new Session(users, this.ram);

    }
}

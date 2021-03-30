package cn.chao.domian;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class User {
    private String username;

    private String password;

    private Integer age;

    private Address address;

    private List<Address> addresses;

    //时间第一种
    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date born;

    private Map<String,Address> addressMap;

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    public String getUsername() {
        return username;
    }

    public Map<String, Address> getAddressMap() {
        return addressMap;
    }

    public void setAddressMap(Map<String, Address> addressMap) {
        this.addressMap = addressMap;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", addresses=" + addresses +
                ", born=" + born +
                ", addressMap=" + addressMap +
                '}';
    }

    public void setAddressList(List<Address> addresses) {
        this.addresses=addresses;
    }
}

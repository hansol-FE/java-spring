package hello.hellospring.domain;

import javax.persistence.*;

@Entity
public class Member {

    // primary키 설정하고 DB에서 자동으로 증가값을 키값으로 설정해준다.
    // 이런 전략을 IDENTITY 전략이라고 함.
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

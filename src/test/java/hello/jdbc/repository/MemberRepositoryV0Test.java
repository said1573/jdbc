package hello.jdbc.repository;

import hello.jdbc.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class MemberRepositoryV0Test {

    MemberRepositoryV0 repository = new MemberRepositoryV0();

    @Test
    void crud() throws SQLException {

        // save
        Member member = new Member("member2", 10000);
        repository.save(member);

        // findById
        Member getMember = repository.findById(member.getMemberId());
        log.info("findMember={}", getMember);
        Assertions.assertThat(getMember).isEqualTo(member);
        
    }
}
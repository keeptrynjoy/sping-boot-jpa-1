package jpabook.springjpa1;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberRepositoryTest {

//    @Autowired
//    MemberRepository memberRepository;

//    @Test
//    @Transactional
//    @Rollback(false)
//    public void testMember() throws Exception{
//        //given
//        Member member = new Member();
//        member.setUsername("memberA");
//
//        //when
//        Long saveId = memberRepository.save(member);
//        Member findMember = memberRepository.find(saveId);
//
//        //then
//        assertThat(findMember.getId()).isEqualTo(member.getId());
//        assertThat(findMember.getUsername()).isEqualTo(member.getUsername());
//        assertThat(findMember).isEqualTo(member);
//        System.out.println("(findMember==member) = " + (findMember==member));
//    }


}
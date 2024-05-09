package hello.core.member;

public interface MemberRepository {
    //회원 생성
    void save(Member member);
    //회원 ID 찾는 기능
    Member findById(Long memberId);
}

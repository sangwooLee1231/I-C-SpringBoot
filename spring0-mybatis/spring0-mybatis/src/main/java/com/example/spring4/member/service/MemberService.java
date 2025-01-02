package com.example.spring4.member.service;

import com.example.spring4.member.dao.MemberMapper;
import com.example.spring4.member.vo.MemberVO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberMapper memberMapper;
    private final PasswordEncoder passwordEncoder;

    //회원가입
    public int insertMember(MemberVO memberVO) {
        return memberMapper.insertMember(memberVO);
    }

    //로그인
    public boolean selectMemberById(MemberVO memberVO){
        MemberVO memberVO1 =  memberMapper.selectMemberById(memberVO.getId());

        if(memberVO1 != null){
            if(memberVO1.getPw().equals(memberVO.getPw())){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    //로그인 사용자 정보 읽어오기
    public MemberVO selectMemberById(String id){
        return memberMapper.selectMemberById(id);
    }

    //회원 탈퇴
    public int deleteMember(String id){
        return memberMapper.deleteMember(id);
    }

    //회원 정보 수정
    public int updateMember(MemberVO memberVO){
        return memberMapper.updateMember(memberVO);
    }
}

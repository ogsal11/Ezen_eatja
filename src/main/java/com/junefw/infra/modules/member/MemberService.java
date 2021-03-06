package com.junefw.infra.modules.member;

import java.util.List;


public interface MemberService {
	
	int selectOneCount(MemberVo vo) throws Exception;
	List<Member> selectList(MemberVo vo) throws Exception;
	public int insert(Member dto) throws Exception;
	public Member selectOne(MemberVo vo) throws Exception;
	public int update(Member dto) throws Exception;
	public int Userupdate(Member dto) throws Exception;
	int delete(MemberVo vo) throws Exception;
	int updateDelet(MemberVo vo) throws Exception;
	
	// 파생 테이블
	public int insertAddress(Member dto) throws Exception;
	public int insertPhone(Member dto) throws Exception;
	public int insertEmail(Member dto) throws Exception;
	
	
	public Member selectOneId(Member dto) throws Exception;
	public Member selectOneLogin(Member dto) throws Exception;

}
package com.photovel.dao;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.photovel.vo.Admin;

@Repository
public class AdminDAO{
	@Autowired
	private SqlSession session;
	
	/**
	 * 관리자 멤버를 반환한다.
	 * @return
	 */
	public List<Admin> selectAll(){
		return session.selectList("AdminMapper.selectAll");//id 값 , parameter로 보낼 값
	}

	/**
	 * 아이디에 해당하는 관리자를 반환한다
	 * @param adminId 아이디
	 * @return 저장소의 고객객체를 반환한다.
	 *         고객을 찾지 못하면 null을 반환한다.
	 */
	public Admin selectById(String adminId){
		return session.selectOne("AdminMapper.selectById", adminId);
	}

	/**
	 * 이름에 해당하는 고객을 반환한다
	 * @param name 이름
	 * @return
	 */
	public List<Admin> selectByName(String adminNickName){
		return session.selectList("AdminMapper.selectByName", adminNickName);//id 값 , parameter로 보낼 값
	}
	
	/**
	 *  * 저장하려는 객체의 id가 저장소에 이미 존재하는 경우
	 * "이미 존재하는 아이디입니다"msg를 출력하고 저장안함.
	 * @param c
	 * @throws Exception 
	 */
	public void insert(Admin ad) throws Exception {
		session.insert("AdminMapper.insert", ad);//id 값 , parameter로 보낼 값
	};	

	public void update(Admin ad) throws Exception {
		session.update("AdminMapper.update", ad);
	}

	public void leave(Admin ad) throws Exception {
		session.update("AdminMapper.leave", ad);
	}
	
	public void stop(Admin ad) throws Exception{
		session.update("AdminMapper.stop", ad);
	}
}
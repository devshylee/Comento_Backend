package com.devfun.settingweb_boot.dao;

import com.devfun.settingweb_boot.domain.Holiday;

import java.util.List;

public interface HolidayMapper {

    // 모든 공휴일 조회
    List<Holiday> selectAllHolidays();

    // 특정 날짜의 공휴일 조회
    Holiday selectHolidayByDate(String holidayDate);

    // 공휴일 추가
    void insertHoliday(Holiday holiday);

    // 공휴일 업데이트
    void updateHoliday(Holiday holiday);

    // 공휴일 삭제
    void deleteHoliday(String holidayDate);
}

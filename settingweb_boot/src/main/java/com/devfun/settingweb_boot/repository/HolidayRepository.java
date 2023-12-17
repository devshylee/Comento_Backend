package com.devfun.settingweb_boot.repository;

import com.devfun.settingweb_boot.domain.Holiday;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HolidayRepository extends JpaRepository<Holiday, Long> {

    boolean existsByHolidayDate(String holidayDate);

}

package com.kafka;

import com.kafka.Model.WikiMedia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaRepository extends JpaRepository<WikiMedia,Long> {
}

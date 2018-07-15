package net.vepilef.log_parser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.vepilef.log_parser.model.entity.CommentLog;

@Repository
public interface CommentLogRepository extends JpaRepository<CommentLog, Long> {
}
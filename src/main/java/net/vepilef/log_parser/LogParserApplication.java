package net.vepilef.log_parser;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import net.vepilef.log_parser.model.dto.Parameters;
import net.vepilef.log_parser.model.entity.CommentLog;
import net.vepilef.log_parser.model.entity.Log;
import net.vepilef.log_parser.service.LogService;

@Service
@SpringBootApplication
public class LogParserApplication implements ApplicationRunner {

    @Autowired
    LogService logService;

    public static void main(String... args) throws Exception {
        SpringApplication.run(LogParserApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Parameters parameters = new Parameters(args);

        if (parameters.getAccessLog() != null) {
            try {
                logService.saveLogs(logService.getLogFromFile(parameters.getAccessLog()));
                System.out.println("Data loaded successfully");
            } catch (Exception e) {
                System.out.println("Problem while loading data. " + e.getMessage());
            }
        }
        if (parameters.requiredPresent()) {
            List<Log> logs = logService.find(parameters);
            List<CommentLog> comments = logService.saveComments(parameters, logs);
            comments.forEach(commentLog -> System.out.println(commentLog.getComment()));
        } else {
            System.out.println(logService.printMessage());
        }
    }
}
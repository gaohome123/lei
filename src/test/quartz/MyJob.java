package quartz;

import org.quartz.*;

import java.util.Date;

/**
 * @author
 * @create 2017-12-12 10:49
 **/
public class MyJob implements Job{

    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        // JobExecutionContext类提供了调度上线问的各种信息,为JobDetail和Trigger提供必要的信息
        // JobKey是由name和group组成，并且name必须在group内是唯一的。如果只指定一组则将使用默认的组名。
        JobDetail detail = jobExecutionContext.getJobDetail();
        String name = detail.getJobDataMap().getString("name");
        System.out.println("hello " + name + "--- " + new Date());

        /**
         * JobDetail detail = context.getJobDetail();
         String name = detail.getJobDataMap().getString("name");
         System.out.println("say hello to " + name + " at " + new Date());
         */
    }
}

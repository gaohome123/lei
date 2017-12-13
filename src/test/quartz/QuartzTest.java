package quartz;

import static org.quartz.SimpleScheduleBuilder.simpleSchedule;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;


/**
 * @author
 * @create 2017-12-12 10:48
 **/

public class QuartzTest {

    public static void main(String[] args) {
        try {
            //创建scheduler
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

            //定义一个Trigger
            Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1", "group1") //定义name/group
                    .startNow()//一旦加入scheduler，立即生效
                    .withSchedule(simpleSchedule() //使用SimpleTrigger
                            .withIntervalInSeconds(1) //每隔一秒执行一次
                            .repeatForever()) //一直执行，奔腾到老不停歇
                    .build();

            //定义一个JobDetail
            // 创建一个JobDetail实例,此版本JobDetail已经作为接口（interface）存在，通过JobBuilder创建
            // 并指定Job在Scheduler中所属组及名称
          //  JobDetail jobDetail = JobBuilder.newJob(MyJob.class).withIdentity("job1","group1").build();
            JobDetail job = JobBuilder.newJob(MyJob.class) //定义Job类为HelloQuartz类，这是真正的执行逻辑所在
                    .withIdentity("job1", "group1") //定义name/group
                    .usingJobData("name", "quartz") //定义属性
                    .build();

            //加入这个调度
            scheduler.scheduleJob(job, trigger);

            //启动之
            scheduler.start();

            //运行一段时间后关闭
            Thread.sleep(10000);
            scheduler.shutdown(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package liudi.test.sentineltest;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author liudi
 * @date 2022/7/11
 * @description
 */
public class Starter {
    private static final Logger logger = Logger.getLogger(Starter.class.getName());

    public static void main(String[] args) {
        initFlowRules();
        while (true) {
            Entry entry = null;
            try {
                entry = SphU.entry("HelloWorld");
                throw new IllegalAccessException("Hello World!");
            } catch (BlockException blockException) {
                logger.log(Level.WARNING, MessageFormat.format("block exception: {0}", blockException.getMessage()));
            } catch (Exception exception) {
                logger.log(Level.INFO, MessageFormat.format("exception: {0}", exception.getMessage()));
                logger.log(Level.WARNING, MessageFormat.format("exception: {0}", exception.getMessage()));
                logger.log(Level.SEVERE, MessageFormat.format("exception: {0}", exception.getMessage()));
            } finally {
                if (entry != null) {
                    entry.exit();
                }
            }
        }

    }

    private static void initFlowRules() {
        List<FlowRule> flowRules = new ArrayList<>();
        FlowRule flowRule = new FlowRule();
        flowRule.setResource("Hello World!");
        flowRule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        // Set limit QPS to 20
        flowRule.setCount(20);
        flowRules.add(flowRule);
        FlowRuleManager.loadRules(flowRules);
    }

}

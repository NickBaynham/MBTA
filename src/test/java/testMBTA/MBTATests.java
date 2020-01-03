package testMBTA;

import models.ModelBuilder;
import org.graphwalker.core.condition.VertexCoverage;
import org.graphwalker.core.generator.RandomPath;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.core.machine.Machine;
import org.graphwalker.core.machine.SimpleMachine;
import org.graphwalker.core.model.Model;
import org.testng.annotations.Test;
import static pageobjects.PassionTeaCompany.*;

public class MBTATests extends ExecutionContext {
    @Test
    public void verifyModelBuilder() {
        Model passionTeaCompany = ModelBuilder.buildModel();
    }

    @Test
    public void verifyFullCoverageTest() {
        Model passionTeaCompany = ModelBuilder.buildModel();
        this.setModel(passionTeaCompany.build());
        this.setPathGenerator(new RandomPath(new VertexCoverage(100)));
        setNextElement(passionTeaCompany.getVertices().get(0));
        Machine machine = new SimpleMachine(this);
        while (machine.hasNextStep()) {
            machine.getNextStep();
        }
    }
}

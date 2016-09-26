package pandemic.feature.shared;

import gherkin.formatter.Formatter;
import gherkin.formatter.Reporter;
import gherkin.formatter.model.*;

import java.util.List;

public class CustomReporter implements Reporter, Formatter {
    @Override
    public void uri(String uri) {
        System.out.println("CustomReporter.uri:" + uri);
    }

    @Override
    public void feature(Feature feature) {
        System.out.println("CustomReporter.feature: " + feature.getName() + ", " + feature.getTags());
    }

    @Override
    public void startOfScenarioLifeCycle(Scenario scenario) {
        System.out.println("CustomReporter.startOfScenarioLifeCycle: " + scenario.getName());
    }

    @Override
    public void endOfScenarioLifeCycle(Scenario scenario) {
        System.out.println("CustomReporter.endOfScenarioLifeCycle: " + scenario.getName());
    }

    @Override
    public void scenarioOutline(ScenarioOutline scenarioOutline) {
    }

    @Override
    public void examples(Examples examples) {
    }

    @Override
    public void background(Background background) {
    }

    @Override
    public void scenario(Scenario scenario) {
        System.out.println("CustomReporter.scenario: " + scenario.getName());
    }

    @Override
    public void step(Step step) {
        System.out.println("CustomReporter.step: " + step.getName());
    }


    @Override
    public void done() {
        System.out.println("CustomReporter.done");
    }

    @Override
    public void close() {
        System.out.println("CustomReporter.close");
    }

    @Override
    public void eof() {
        System.out.println("CustomReporter.eof");
    }

    @Override
    public void before(Match match, Result result) {
        System.out.println("CustomReporter.before: " + match.getLocation() + ", " + match.getArguments());
    }

    @Override
    public void match(Match match) {
        System.out.println("CustomReporter.match: " + match.getLocation());
    }

    @Override
    public void result(Result result) {
        System.out.println("CustomReporter.result: " + result.getStatus());
    }

    @Override
    public void after(Match match, Result result) {
        System.out.println("CustomReporter.after:" + match.getLocation() + ", " + match.getArguments());
    }

    @Override
    public void embedding(String mimeType, byte[] data) {

    }

    @Override
    public void write(String text) {
        System.out.println("CustomReporter.write: " + text);
    }

    @Override
    public void syntaxError(String state, String event, List<String> legalEvents, String uri, Integer line) {

    }


}

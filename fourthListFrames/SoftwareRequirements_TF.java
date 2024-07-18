package fourthListFrames;

import frame.True_False_Questions;

public class SoftwareRequirements_TF extends True_False_Questions {

    public SoftwareRequirements_TF(String name) {
        super(name);
        loadQuestions();
    }
   

// 52
    @Override
    public final void loadQuestions() {

        questions.add("Software requirements are the functionalities and constraints that a software system must provide or satisfy.");
        answers.add("True");

        questions.add("Functional requirements specify what the software system should do.");
        answers.add("True");

        questions.add("Non-functional requirements are also known as functional requirements.");
        answers.add("False");

        questions.add("Non-functional requirements describe how the system should behave or perform.");
        answers.add("True");

        questions.add("Requirements elicitation is the process of gathering and defining the requirements from stakeholders.");
        answers.add("True");

        questions.add("Requirements analysis involves evaluating requirements for completeness, consistency, and feasibility.");
        answers.add("True");

        questions.add("User stories are a formal way of documenting software requirements.");
        answers.add("False");

        questions.add("Use cases are diagrams that depict interactions between actors and the system.");
        answers.add("False");

        questions.add("User requirements are typically expressed in technical terms and details.");
        answers.add("False");

        questions.add("Functional requirements are typically written using natural language and can include diagrams and models.");
        answers.add("True");

        questions.add("A use case diagram depicts the interaction between the system and its users.");
        answers.add("True");

        questions.add("Software requirements are static and do not change once defined.");
        answers.add("False");

        questions.add("Ambiguous requirements are clear and precise, leaving no room for interpretation.");
        answers.add("False");

        questions.add("Traceability matrices are used to track the relationship between requirements and other artifacts.");
        answers.add("True");

        questions.add("Prototyping is a technique used to validate requirements by building an early, simplified version of the system.");
        answers.add("True");

        questions.add("Requirements prioritization involves ranking requirements based on their importance and feasibility.");
        answers.add("True");

        questions.add("In agile development, requirements are fixed and cannot change during the development process.");
        answers.add("False");

        questions.add("Requirements validation ensures that the documented requirements accurately reflect stakeholder needs.");
        answers.add("True");

        questions.add("Requirements management involves only documenting requirements and does not include monitoring changes.");
        answers.add("False");

        questions.add("A functional requirement specifies how the system should behave in response to input.");
        answers.add("True");

        questions.add("Non-functional requirements are often related to performance, security, usability, and reliability.");
        answers.add("True");

        questions.add("Software requirements engineering is only concerned with gathering requirements, not analyzing or validating them.");
        answers.add("False");

        questions.add("Software requirements may include both mandatory requirements and optional features.");
        answers.add("True");

        questions.add("A requirement that is 'testable' means that it can be verified or validated.");
        answers.add("True");

        questions.add("Version control systems are not useful for managing changes to software requirements.");
        answers.add("False");

        questions.add("A requirement that is 'feasible' means it can be implemented within constraints such as time and budget.");
        answers.add("True");

        questions.add("A well-defined requirement is clear, complete, consistent, and unambiguous.");
        answers.add("True");

        questions.add("A use case scenario describes a specific sequence of actions performed by a user.");
        answers.add("True");

        questions.add("Requirements can be classified into functional, non-functional, and technical categories.");
        answers.add("True");

        questions.add("User requirements are often expressed in terms of 'what' the system should do, not 'how' it should do it.");
        answers.add("True");

        questions.add("A requirements document should include all possible details about the system, regardless of relevance.");
        answers.add("False");

        questions.add("Stakeholders are individuals or groups who have an interest in the success of the software project.");
        answers.add("True");

        questions.add("Requirements engineering involves eliciting, analyzing, specifying, validating, and managing requirements.");
        answers.add("True");

        questions.add("Requirements validation ensures that the software meets the needs of stakeholders.");
        answers.add("True");

        questions.add("Prototyping is primarily used to replace detailed requirements gathering.");
        answers.add("False");

        questions.add("Requirements analysis involves prioritizing requirements based on their importance and impact.");
        answers.add("True");

        questions.add("User stories are detailed, formal documents that specify software requirements.");
        answers.add("False");

        questions.add("Use case diagrams are used to represent functional requirements.");
        answers.add("False");

        questions.add("Requirements engineering involves understanding stakeholder needs and translating them into a documented form.");
        answers.add("True");

        questions.add("Non-functional requirements are concerned with the internal workings of the software system.");
        answers.add("False");

        questions.add("A traceability matrix is a tool used to track the origin and status of requirements throughout the project lifecycle.");
        answers.add("True");

        questions.add("Requirements management includes controlling changes to requirements throughout the project lifecycle.");
        answers.add("True");

        questions.add("Agile methodologies prioritize comprehensive documentation over responding to change.");
        answers.add("False");

        questions.add("A well-written requirement includes technical jargon to ensure accuracy.");
        answers.add("False");

        questions.add("Requirements elicitation involves gathering information about stakeholder needs and constraints.");
        answers.add("True");

        questions.add("Software requirements are typically expressed in a single format and cannot include diagrams or models.");
        answers.add("False");

        questions.add("Non-functional requirements are usually measurable and can be tested.");
        answers.add("True");

        questions.add("Use cases describe interactions between the system and external entities.");
        answers.add("True");

        questions.add("User requirements focus on technical details and implementation specifics.");
        answers.add("False");

        questions.add("Requirements validation ensures that the software system can be developed within budget constraints.");
        answers.add("False");

        questions.add("Software requirements are dynamic and may change throughout the project lifecycle.");
        answers.add("True");

        questions.add("Requirements management involves documenting requirements and monitoring changes throughout the project lifecycle.");
        answers.add("True");

    }

    public static void main(String[] args) {
        new SoftwareRequirements_TF(name).setVisible(true);
    }

}

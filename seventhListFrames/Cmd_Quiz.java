package seventhListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class Cmd_Quiz extends Quiz {

    public Cmd_Quiz(String name) {
        super(name);
        loadQuestions();
        setupQuiz();
    }

    private void setupQuiz() {
        shuffleIndices();
        selectTotalQuestions();
        setCurrentQuestion();
        setQuestionTextAndOptions();
    }


    @Override
    public void setQuestionTextAndOptions() {
        qno.setText("Question #: " + currentQno);
        question.setText(questions.get(currentQuestionIndex));
        opt1.setText(options.get(currentQuestionIndex).split(", ")[0]);
        opt2.setText(options.get(currentQuestionIndex).split(", ")[1]);
        opt3.setText(options.get(currentQuestionIndex).split(", ")[2]);
        opt4.setText(options.get(currentQuestionIndex).split(", ")[3]);
    }

//  questions41
    @Override
    public final void loadQuestions() {
        questions.add("The Command Prompt is also known as ___.");
        options.add("A) CMD, B) Command Shell, C) Terminal, D) Prompt");
        answers.add("A) CMD");

        questions.add("The Command Prompt is used to interact with the ___ operating system.");
        options.add("A) Windows, B) macOS, C) Linux, D) ChromeOS");
        answers.add("A) Windows");

        questions.add("The Command Prompt is accessed by pressing ___ + R.");
        options.add("A) Windows, B) Ctrl, C) Alt, D) Shift");
        answers.add("A) Windows");

        questions.add("The ___ command is used to display the current directory.");
        options.add("A) cd, B) dir, C) pwd, D) ls");
        answers.add("B) dir");

        questions.add("The ___ command is used to change the current directory.");
        options.add("A) cd, B) dir, C) pwd, D) ls");
        answers.add("A) cd");

        questions.add("The ___ command is used to list the files and directories in the current directory.");
        options.add("A) cd, B) dir, C) pwd, D) ls");
        answers.add("D) ls");

        questions.add("The ___ command is used to create a new directory.");
        options.add("A) cd, B) dir, C) mkdir, D) rm");
        answers.add("C) mkdir");

        questions.add("The ___ command is used to delete a file or directory.");
        options.add("A) cd, B) dir, C) mkdir, D) rm");
        answers.add("D) rm");

        questions.add("The ___ command is used to copy a file.");
        options.add("A) cp, B) mv, C) rm, D) dir");
        answers.add("A) cp");

        questions.add("The ___ command is used to move or rename a file.");
        options.add("A) cp, B) mv, C) rm, D) dir");
        answers.add("B) mv");

        questions.add("The ___ command is used to display the contents of a file.");
        options.add("A) cat, B) echo, C) type, D) more");
        answers.add("A) cat");

        questions.add("The ___ command is used to display the contents of a file one page at a time.");
        options.add("A) cat, B) echo, C) type, D) more");
        answers.add("D) more");

        questions.add("The ___ command is used to display the contents of a file with line numbers.");
        options.add("A) cat, B) echo, C) type, D) nl");
        answers.add("D) nl");

        questions.add("The ___ command is used to search for a pattern in a file.");
        options.add("A) grep, B) find, C) search, D) query");
        answers.add("A) grep");

        questions.add("The ___ command is used to find files based on various criteria.");
        options.add("A) grep, B) find, C) search, D) query");
        answers.add("B) find");

        questions.add("The ___ command is used to display the system's environment variables.");
        options.add("A) set, B) env, C) variables, D) settings");
        answers.add("A) set");

        questions.add("The ___ command is used to display the system's date and time.");
        options.add("A) date, B) time, C) datetime, D) clock");
        answers.add("A) date");

        questions.add("The ___ command is used to display the system's calendar.");
        options.add("A) cal, B) calendar, C) date, D) time");
        answers.add("A) cal");

        questions.add("The ___ command is used to clear the screen.");
        options.add("A) clear, B) cls, C) clean, D) purge");
        answers.add("B) cls");

        questions.add("The ___ command is used to display the system's IP address.");
        options.add("A) ipconfig, B) ifconfig, C) ip addr, D) network");
        answers.add("A) ipconfig");

        questions.add("The ___ command is used to display the system's network configuration.");
        options.add("A) ipconfig, B) ifconfig, C) ip addr, D) network");
        answers.add("A) ipconfig");

        questions.add("The ___ command is used to ping a website or IP address.");
        options.add("A) ping, B) traceroute, C) nslookup, D) dig");
        answers.add("A) ping");

        questions.add("The ___ command is used to display the route to a website or IP address.");
        options.add("A) ping, B) traceroute, C) nslookup, D) dig");
        answers.add("B) traceroute");

        questions.add("The ___ command is used to display the system's DNS resolution.");
        options.add("A) nslookup, B) dig, C) ping, D) traceroute");
        answers.add("A) nslookup");

        questions.add("The ___ command is used to display the system's network statistics.");
        options.add("A) netstat, B) ping, C) traceroute, D) nslookup");
        answers.add("A) netstat");

        questions.add("The ___ command is used to display the system's process list.");
        options.add("A) tasklist, B) process, C) ps, D) top");
        answers.add("A) tasklist");

        questions.add("The ___ command is used to kill a process.");
        options.add("A) taskkill, B) kill, C) terminate, D) stop");
        answers.add("A) taskkill");

        questions.add("The ___ command is used to display the system's disk usage.");
        options.add("A) diskusage, B) du, C) df, D) diskstat");
        answers.add("C) df");

        questions.add("The ___ command is used to display the system's disk space.");
        options.add("A) diskspace, B) df, C) du, D) diskusage");
        answers.add("B) df");

        questions.add("The ___ command is used to create a new file.");
        options.add("A) touch, B) create, C) new, D) make");
        answers.add("A) touch");

        questions.add("The ___ command is used to append text to a file.");
        options.add("A) >>, B) >, C) append, D) add");
        answers.add("A) >>");

        questions.add("The ___ command is used to display the system's help documentation.");
        options.add("A) help, B) man, C) doc, D) info");
        answers.add("A) help");

        questions.add("The ___ command is used to display the system's version information.");
        options.add("A) ver, B) version, C) info, D) about");
        answers.add("A) ver");

        questions.add("The ___ command is used to shut down the system.");
        options.add("A) shutdown, B) poweroff, C) reboot, D) exit");
        answers.add("A) shutdown");

        questions.add("The ___ command is used to restart the system.");
        options.add("A) reboot, B) restart, C) shutdown, D) boot");
        answers.add("A) reboot");

        questions.add("The ___ command is used to display the system's environment variables.");
        options.add("A) set, B) env, C) variables, D) settings");
        answers.add("A) set");

        questions.add("The ___ command is used to display the system's path.");
        options.add("A) path, B) PATH, C) dir, D) ls");
        answers.add("A) path");

        questions.add("The ___ command is used to display the system's username.");
        options.add("A) username, B) user, C) whoami, D) id");
        answers.add("C) whoami");

        questions.add("The ___ command is used to display the system's computer name.");
        options.add("A) computername, B) hostname, C) machine, D) node");
        answers.add("B) hostname");

        questions.add("The ___ command is used to display the system's date and time in RFC 2822 format.");
        options.add("A) date, B) time, C) datetime, D) rfcdate");
        answers.add("D) rfcdate");

        questions.add("The ___ command is used to display the system's UTC offset.");
        options.add("A) utc, B) timezone, C) offset, D) tz");
        answers.add("B) timezone");

    }

    public static void main(String[] args) {
        new Cmd_Quiz(name).setVisible(true);
    }

}

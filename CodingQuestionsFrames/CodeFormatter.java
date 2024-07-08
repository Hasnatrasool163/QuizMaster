package CodingQuestionsFrames;

public class CodeFormatter {
   public  String formatCode(String answer) {
    String formattedAnswer = "<html><body> <font style=\"font-size: 22pt; font-family: Tahoma;\">";

    // Java specific formatting
    if (answer.contains("public class")) {
        formattedAnswer += answer
            .replace("{", "{<br>&nbsp;&nbsp;")
            .replace(":", ":&nbsp;&nbsp;")
            .replace("}", "<br>}")
            .replace("if (", "<br>if (")
            .replace("};", "};<br>&nbsp;&nbsp;")
            .replace("System", "<br>&nbsp;&nbsp;System")
            .replace("; int", ";<br>&nbsp;&nbsp;int")
            .replace("for (", "<br>&nbsp;&nbsp;for (")
            .replace("else", "<br>else");
    }

    // C++ specific formatting
    else if (answer.contains("#include")) {
        formattedAnswer += answer
            .replace("{", "{<br>&nbsp;&nbsp;")
            .replace(";", ";<br>&nbsp;&nbsp;")
            .replace("}", "<br>}")
            .replace("cout", "<br>&nbsp;&nbsp;cout")
            .replace("cin", "<br>&nbsp;&nbsp;cin");
    }

    // C specific formatting
    else if (answer.contains("#include <stdio.h>")) {
        formattedAnswer += answer
            .replace("{", "{<br>&nbsp;&nbsp;")
            .replace(";", ";<br>&nbsp;&nbsp;")
            .replace("}", "<br>}")
            .replace("printf", "<br>&nbsp;&nbsp;printf")
            .replace("scanf", "<br>&nbsp;&nbsp;scanf");
    }

    // Python specific formatting
    else if (answer.contains("def ")) {
        formattedAnswer += answer
            .replace("{", "<br>&nbsp;&nbsp;{")
            .replace(":", ":<br>&nbsp;&nbsp;")
            .replace("}", "<br>}")
            .replace("(", "<br>&nbsp;&nbsp;(")
            .replace(")", ")")
            .replace("print", "<br>&nbsp;&nbsp;print")
            .replace("input", "<br>&nbsp;&nbsp;input");
    }

    // JS specific formatting
    else if (answer.contains("function ")) {
        formattedAnswer += answer
            .replace("{", "{<br>&nbsp;&nbsp;")
            .replace(":", ":<br>&nbsp;&nbsp;")
            .replace("}", "<br>}")
            .replace("(", "<br>&nbsp;&nbsp;(")
            .replace(")", ")")
            .replace("console.log", "<br>&nbsp;&nbsp;console.log")
            .replace("alert", "<br>&nbsp;&nbsp;alert");
    }

    formattedAnswer += "</body></html>";
    return formattedAnswer;
}
}

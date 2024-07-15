package rules;

import frame.Menu;
import javax.swing.*;

import eighthListFrames.Amazon_AWS_Quiz;  // 7 
import eighthListFrames.MongoDB_Quiz;
import eighthListFrames.MySQL_Quiz;
import eighthListFrames.Oracle_Quiz;
import eighthListFrames.PostgreSQL_Quiz;
import eighthListFrames.SQLServer_Quiz;
import eighthListFrames.SqlLite_Quiz;

import eleventhListFrames.Chart_Quiz; // 9 
import eleventhListFrames.MatPlotLib_Quiz;
import eleventhListFrames.Moment_Quiz;
import eleventhListFrames.Swing_Quiz;
import eleventhListFrames.Tkinter_Quiz;
import eleventhListFrames.Numpy_Quiz;
import eleventhListFrames.Pandas_Quiz;
import eleventhListFrames.Redux_Quiz;
import eleventhListFrames.Requests_Quiz;

import fifthListFrames.Algebra_Quiz; // 9 
import fifthListFrames.Algebra_TF;
import fifthListFrames.Calculus_Quiz;
import fifthListFrames.DiscreteMaths_Quiz;
import fifthListFrames.Discrete_TF;
import fifthListFrames.Graphs_Quiz;
import fifthListFrames.Graphs_TF;
import fifthListFrames.Logics_Quiz;
import fifthListFrames.Theorems_Quiz;

import firstListFrames.Basic_Quiz; // 30
import firstListFrames.C_Hash_Quiz;
import firstListFrames.C_Hash_TF;
import firstListFrames.C_Output;
import firstListFrames.C_Plus_Plus_Output;
import firstListFrames.C_Plus_Plus_Quiz;
import firstListFrames.C_Plus_Plus_TF;
import firstListFrames.C_Quiz;
import firstListFrames.C_TF;
import firstListFrames.Css_Quiz;
import firstListFrames.Css_TF;
import firstListFrames.Html_Quiz;
import firstListFrames.Html_TF;
import firstListFrames.Java_Output;
import firstListFrames.Java_Quiz;
import firstListFrames.Java_TF;
import firstListFrames.Js_Output;
import firstListFrames.Js_Quiz;
import firstListFrames.Js_TF;
import firstListFrames.Lisp_Quiz;
import firstListFrames.Php_Quiz;
import firstListFrames.Php_TF;
import firstListFrames.Python_Output;
import firstListFrames.Python_Quiz;
import firstListFrames.Python_TF;
import firstListFrames.R_Quiz;
import firstListFrames.Ruby_Quiz;
import firstListFrames.Ruby_TF;
import firstListFrames.Rust_Quiz;
import firstListFrames.Rust_TF; // total 45 

import fourthListFrames.Algorithms_Quiz;// 15
import fourthListFrames.Algorithms_TF;
import fourthListFrames.CyberSecurity_Quiz;
import fourthListFrames.CyberSecurity_TF;
import fourthListFrames.DataBases_Quiz;
import fourthListFrames.DataBases_TF;
import fourthListFrames.DataStructures_Quiz;
import fourthListFrames.DataStructures_TF;
import fourthListFrames.DesignPattern_Quiz;
import fourthListFrames.DesignPatterns_TF;
import fourthListFrames.ICT_TF;
import fourthListFrames.Ict_Quiz;
import fourthListFrames.SoftwareRequirement_Quiz;
import fourthListFrames.SoftwareRequirements_TF;
import fourthListFrames.TheoryOfAutomata_Quiz; // total 60 

import ninthListFrames.AI_Quiz; // 12
import ninthListFrames.AI_TF;
import ninthListFrames.GUI_Quiz;
import ninthListFrames.GUI_TF;
import ninthListFrames.Google_Ads_Quiz;
import ninthListFrames.Linux_Quiz;
import ninthListFrames.Mac_OS_Quiz;
import ninthListFrames.NoSQL_Quiz;
import ninthListFrames.OOP_Quiz;
import ninthListFrames.OOP_TF;
import ninthListFrames.SEO_Quiz;
import ninthListFrames.Windows_Quiz; // total 72

import secondListFrames.Accounting_Quiz; // 17 
import secondListFrames.Accounting_TF;
import secondListFrames.Computer2_Quiz;
import secondListFrames.Computer3_Quiz;
import secondListFrames.Computer4_Quiz;
import secondListFrames.Computer5_Quiz;
import secondListFrames.Computer_Quiz;
import secondListFrames.Computer_TF;
import secondListFrames.Earth_Quiz;
import secondListFrames.Earth_TF;
import secondListFrames.Facts_Quiz;
import secondListFrames.Facts_TF;
import secondListFrames.Geography_Quiz;
import secondListFrames.History_Geo_TF;
import secondListFrames.History_Quiz;
import secondListFrames.HumanBody_Quiz;
import secondListFrames.HumanBody_TF; // total 89

import seventhListFrames.Adobe_Acrobat_Quiz; // 7 
import seventhListFrames.Cmd_Quiz;
import seventhListFrames.GitBash_Quiz;
import seventhListFrames.MsAccess_Quiz;
import seventhListFrames.MsExcel_Quiz;
import seventhListFrames.MsPowerPoint_Quiz;
import seventhListFrames.MsWord_Quiz;  // total 96

import sixthListFrames.Civics_Quiz; // 6
import sixthListFrames.ConstitutionOfPakistan_Quiz;
import sixthListFrames.ForeignPolicy_Quiz;
import sixthListFrames.Pakistan_Quiz;
import sixthListFrames.Pakistan_TF;
import sixthListFrames.WorldPolitics_Quiz; // total 102

import tenthListFrames.Angular_Quiz; // 7
import tenthListFrames.Django_Quiz;
import tenthListFrames.Flask_Quiz;
import tenthListFrames.Hibernate_Quiz;
import tenthListFrames.React_Quiz;
import tenthListFrames.Spring_Boot_Quiz;
import tenthListFrames.TensorFlow_Quiz; // total 109

import thirdListFrames.Astrology_Quiz; // 13
import thirdListFrames.Astrology_TF; 
import thirdListFrames.Biology_Quiz;
import thirdListFrames.Biology_TF;
import thirdListFrames.Chemistry_Quiz;
import thirdListFrames.Chemistry_TF;
import thirdListFrames.Engineering_Quiz;
import thirdListFrames.Engineering_TF;
import thirdListFrames.Geology_Quiz;
import thirdListFrames.Mathematics_Quiz;
import thirdListFrames.Mathematics_TF;
import thirdListFrames.Physics_Quiz;
import thirdListFrames.Physics_TF; // total 122

import twelvethListFrames.Cargo_Quiz; // 9 
import twelvethListFrames.Composer_Quiz;
import twelvethListFrames.Gradle_Quiz;
import twelvethListFrames.Homebrew_Quiz;
import twelvethListFrames.Maven_Quiz;
import twelvethListFrames.Npm_Quiz;
import twelvethListFrames.Nu_Get_Quiz;
import twelvethListFrames.Pip_Quiz;
import twelvethListFrames.RubyGems_Quiz; // total 131

public class FrameFactory {

    public static JFrame getFrame(String subject, String name) {
        return createFrameInstance(subject, name);
    }

    private static JFrame createFrameInstance(String subject, String name) {
        switch (subject) {
            case "Java" -> {
                return new Java_Quiz(name);
            }
            case "C" -> {
                return new C_Quiz(name);
            }
            case "C++" -> {
                return new C_Plus_Plus_Quiz(name);
            }
            case "C#" -> {
                return new C_Hash_Quiz(name);
            }
            case "Python" -> {
                return new Python_Quiz(name);
            }
            case "PHP" -> {
                return new Php_Quiz(name);
            }
            case "JS" -> {
                return new Js_Quiz(name);
            }
            case "HTML" -> {
                return new Html_Quiz(name);
            }
            case "CSS" -> {
                return new Css_Quiz(name);
            }
            case "Ruby" -> {
                return new Ruby_Quiz(name);
            }
            case "Basic" -> {
                return new Basic_Quiz(name);
            }
            case "Lisp" -> {
                return new Lisp_Quiz(name);
            }
            case "Rust" -> {
                return new Rust_Quiz(name);
            }
            case "R" -> {
                return new R_Quiz(name);
            }
            case "Chemistry" -> {
                return new Chemistry_Quiz(name);
            }
            case "Physics" -> {
                return new Physics_Quiz(name);
            }
            case "Accounting" -> {
                return new Accounting_Quiz(name);
            }
            case "Biology" -> {
                return new Biology_Quiz(name);
            }
            case "Astrology" -> {
                return new Astrology_Quiz(name);
            }
            case "Geology" -> {
                return new Geology_Quiz(name);
            }
            case "Human Body" -> {
                return new HumanBody_Quiz(name);
            }
            case "Geography" -> {
                return new Geography_Quiz(name);
            }
            case "Facts" -> {
                return new Facts_Quiz(name);
            }
            case "History" -> {
                return new History_Quiz(name);
            }
            case "Earth" -> {
                return new Earth_Quiz(name);
            }
            case "Computer" -> {
                return new Computer_Quiz(name);
            }
            case "Computer2" -> {
                return new Computer2_Quiz(name);
            }
            case "Computer3" -> {
                return new Computer3_Quiz(name);
            }
            case "Computer4" -> {
                return new Computer4_Quiz(name);
            }
            case "Computer5" -> {
                return new Computer5_Quiz(name);
            }
            case "Engineering" -> {
                return new Engineering_Quiz(name);
            }
            case "Mathematics" -> {
                return new Mathematics_Quiz(name);
            }
            case "Ms Word" -> {
                return new MsWord_Quiz(name);
            }
            case "Adobe Acrobat" -> {
                return new Adobe_Acrobat_Quiz(name);
            }
            case "Git" -> {
                return new GitBash_Quiz(name);
            }
            case "Cmd" -> {
                return new Cmd_Quiz(name);
            }
            case "Ms Access" -> {
                return new MsAccess_Quiz(name);
            }
            case "Ms Excel" -> {
                return new MsExcel_Quiz(name);
            }
            case "Ms PowerPoint" -> {
                return new MsPowerPoint_Quiz(name);
            }
            case "Tkinter" -> {
                return new Tkinter_Quiz(name);
            }
            case "Matplotlib" -> {
                return new MatPlotLib_Quiz(name);
            }
            case "Swing" -> {
                return new Swing_Quiz(name);
            }
            case "Moment.js" -> {
                return new Moment_Quiz(name);
            }
            case "Chart.js" -> {
                return new Chart_Quiz(name);
            }
            case "Numpy" -> {
                return new Numpy_Quiz(name);
            }
            case "Redux" -> {
                return new Redux_Quiz(name);
            }
            case "Requests" -> {
                return new Requests_Quiz(name);
            }
            case "Pandas" -> {
                return new Pandas_Quiz(name);
            }
            case "Logics" -> {
                return new Logics_Quiz(name);
            }
            case "Calculus" -> {
                return new Calculus_Quiz(name);
            }
            case "Algebra" -> {
                return new Algebra_Quiz(name);
            }
            case "Algorithms" -> {
                return new Algorithms_Quiz(name);
            }
            case "CyberSecurity" -> {
                return new CyberSecurity_Quiz(name);
            }
            case "DataBases" -> {
                return new DataBases_Quiz(name);
            }
            case "Discrete Maths" -> {
                return new DiscreteMaths_Quiz(name);
            }
            case "Discrete_TF" -> {
                return new Discrete_TF(name);
            }
            case "Graphs" -> {
                return new Graphs_Quiz(name);
            }
            case "Graphs_TF" -> {
                return new Graphs_TF(name);
            }
            case "Theorems" -> {
                return new Theorems_Quiz(name);
            }
            case "DataStructures" -> {
                return new DataStructures_Quiz(name);
            }
            case "DesignPatterns" -> {
                return new DesignPattern_Quiz(name);
            }
            case "ICT" -> {
                return new Ict_Quiz(name);
            }
            case "SoftwareRequirement" -> {
                return new SoftwareRequirement_Quiz(name);
            }
            case "TheoryOfAutomata" -> {
                return new TheoryOfAutomata_Quiz(name);
            }
            case "Linux" -> {
                return new Linux_Quiz(name);
            }
            case "Windows" -> {
                return new Windows_Quiz(name);
            }
            case "Mac OS" -> {
                return new Mac_OS_Quiz(name);
            }
            case "OOP" -> {
                return new OOP_Quiz(name);
            }
            case "OOP_TF" -> {
                return new OOP_TF(name);
            }
            case "SEO" -> {
                return new SEO_Quiz(name);
            }
            case "Civics" -> {
                return new Civics_Quiz(name);
            }
            case "Constitution" -> {
                return new ConstitutionOfPakistan_Quiz(name);
            }
            case "Foreign Policy" -> {
                return new ForeignPolicy_Quiz(name);
            }
            case "Pakistan" -> {
                return new Pakistan_Quiz(name);
            }
            case "World Politics" -> {
                return new WorldPolitics_Quiz(name);
            }
            case "Amazon" -> {
                return new Amazon_AWS_Quiz(name);
            }
            case "MySql" -> {
                return new MySQL_Quiz(name);
            }
            case "MongoDB" -> {
                return new MongoDB_Quiz(name);
            }
            case "PostgreSQL" -> {
                return new PostgreSQL_Quiz(name);
            }
            case "SQL Server" -> {
                return new SQLServer_Quiz(name);
            }
            case "Oracle" -> {
                return new Oracle_Quiz(name);
            }
            case "SqlLite" -> {
                return new SqlLite_Quiz(name);
            }
            case "AI" -> {
                return new AI_Quiz(name);
            }
            case "GUI" -> {
                return new GUI_Quiz(name);
            }
            case "Google Ads" -> {
                return new Google_Ads_Quiz(name);
            }
            case "NoSQl" -> {
                return new NoSQL_Quiz(name);
            }
            case "Angular" -> {
                return new Angular_Quiz(name);
            }
            case "Django" -> {
                return new Django_Quiz(name);
            }
            case "Flask" -> {
                return new Flask_Quiz(name);
            }
            case "TensorFlow" -> {
                return new TensorFlow_Quiz(name);
            }
            case "Spring Boot" -> {
                return new Spring_Boot_Quiz(name);
            }
            case "Hibernate" -> {
                return new Hibernate_Quiz(name);
            }
            case "React" -> {
                return new React_Quiz(name);
            }
            case "Cargo" -> {
                return new Cargo_Quiz(name);
            }
            case "Composer" -> {
                return new Composer_Quiz(name);
            }
            case "Gradle" -> {
                return new Gradle_Quiz(name);
            }
            case "Homebrew" -> {
                return new Homebrew_Quiz(name);
            }
            case "Maven" -> {
                return new Maven_Quiz(name);
            }
            case "npm" -> {
                return new Npm_Quiz(name);
            }
            case "Nu-Get" -> {
                return new Nu_Get_Quiz(name);
            }
            case "pip" -> {
                return new Pip_Quiz(name);
            }
            case "RubyGems" -> {
                return new RubyGems_Quiz(name);
            }
            case "C_TF" -> {
                return new C_TF(name);
            }
            case "C_Plus_Plus_TF" -> {
                return new C_Plus_Plus_TF(name);
            }
            case "Java_TF" -> {
                return new Java_TF(name);
            }
            case "C_Hash_TF" -> {
                return new C_Hash_TF(name);
            }
            case "Ruby_TF" -> {
                return new Ruby_TF(name);
            }
            case "JS_TF" -> {
                return new Js_TF(name);
            }
            case "Html_TF" -> {
                return new Html_TF(name);
            }
            case "Css_TF" -> {
                return new Css_TF(name);
            }
            case "Php_TF" -> {
                return new Php_TF(name);
            }
            case "Python_TF" -> {
                return new Python_TF(name);
            }
            case "Rust_TF" -> {
                return new Rust_TF(name);
            }
            case "Accounting_TF" -> {
                return new Accounting_TF(name);
            }
            case "Computer_TF" -> {
                return new Computer_TF(name);
            }
            case "Facts_TF" -> {
                return new Facts_TF(name);
            }
            case "Earth_TF" -> {
                return new Earth_TF(name);
            }
            case "History_TF" -> {
                return new History_Geo_TF(name);
            }
            case "Pakistan_TF" -> {
                return new Pakistan_TF(name);
            }
            case "HumanBody_TF" -> {
                return new HumanBody_TF(name);
            }
            case "Biology_TF" -> {
                return new Biology_TF(name);
            }
            case "Chemistry_TF" -> {
                return new Chemistry_TF(name);
            }
            case "Physics_TF" -> {
                return new Physics_TF(name);
            }
            case "Engineering_TF" -> {
                return new Engineering_TF(name);
            }
            case "Astrology_TF" -> {
                return new Astrology_TF(name);
            }
            case "Mathematics_TF" -> {
                return new Mathematics_TF(name);
            }
            case "Algebra_TF" -> {
                return new Algebra_TF(name);
            }
            case "ICT_TF" -> {
                return new ICT_TF(name);
            }
            case "CyberSecurity_TF" -> {
                return new CyberSecurity_TF(name);
            }
            case "SoftwareRequirements_TF" -> {
                return new SoftwareRequirements_TF(name);
            }
            case "DesignPatterns_TF" -> {
                return new DesignPatterns_TF(name);
            }
            case "Algorithms_TF" -> {
                return new Algorithms_TF(name);
            }
            case "DataBases_TF" -> {
                return new DataBases_TF(name);
            }
            case "DataStructures_TF" -> {
                return new DataStructures_TF(name);
            }
            case "AI_TF" -> {
                return new AI_TF(name);
            }
            case "GUI_TF" -> {
                return new GUI_TF(name);
            }
            case "Java_Output" -> {
                return new Java_Output(name);
            }
            case "C_Output" -> {
                return new C_Output(name);
            }
            case "C_Plus_Plus_Output" -> {
                return new C_Plus_Plus_Output(name);
            }
            case "Python_Output" -> {
                return new Python_Output(name);
            }
            case "JS_Output" -> {
                return new Js_Output(name);
            }
            default ->
                JOptionPane.showMessageDialog(null, subject + " : Not supported till now!", "Invalid Topic", JOptionPane.WARNING_MESSAGE);
        }
        Menu.getInstance().setVisible(true);
        return null;
    }
}

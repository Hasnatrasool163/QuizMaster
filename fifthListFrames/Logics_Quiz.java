package fifthListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class Logics_Quiz extends Quiz{
    

    public Logics_Quiz(String name) {
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

    // questions:

    @Override
    public final void loadQuestions() {
        
        questions.add("A man buys a horse for $60 and sells it for $70. He then buys the horse back for $80 and sells it again for $90. How much profit did he make in total?");
        options.add("A) $10, B) $20, C) $30, D) $40");
        answers.add("B) $20");

        questions.add("A person is standing at one corner of a square park and wants to reach the opposite corner. If they can only move horizontally or vertically, how many different paths can they take?");
        options.add("A) 2, B) 4, C) 6, D) 8");
        answers.add("B) 4");

        questions.add("A barrel contains a mix of red, blue, and green balls. The ratio of red to blue balls is 2:3, and the ratio of blue to green balls is 4:5. If there are 30 blue balls, how many green balls are there?");
        options.add("A) 20, B) 24, C) 30, D) 37");
        answers.add("C) 37");

        questions.add("A bat and a ball together cost $1.10. The bat costs $1.00 more than the ball. How much does the ball cost?");
        options.add("A) $0.05, B) $0.10, C) $0.15, D) $0.20");
        answers.add("A) $0.05");
        
        questions.add("Two people start from the same point and walk in opposite directions for 3 miles. Then each turns to their left and walks another 4 miles. How far apart are they now?");
        options.add("A) 5 miles, B) 6 miles, C) 10 miles, D) 14 miles");
        answers.add("C) 10 miles");

        questions.add("A man has a 10-liter container full of water. He also has two empty containers: one with a capacity of 7 liters and the other with a capacity of 3 liters. How can he measure exactly 5 liters?");
        options.add("A) Fill the 7-liter container, B) Fill the 3-liter container twice, C) Fill the 7-liter container and pour into the 3-liter container until it is full, D) Fill the 7-liter container and pour into the 3-liter container until it is full twice");
        answers.add("C) Fill the 7-liter container and pour into the 3-liter container until it is full");

        questions.add("A person needs to cross a river with a wolf, a goat, and a cabbage. The boat can only carry the person and one other item at a time. If left alone, the wolf will eat the goat and the goat will eat the cabbage. How can the person cross the river without losing any items?");
        options.add("A) Take the goat first, then the wolf, then the cabbage, B) Take the wolf first, then the goat, then the cabbage, C) Take the cabbage first, then the goat, then the wolf, D) Take the goat first, then the cabbage, then the wolf");
        answers.add("A) Take the goat first, then the wolf, then the cabbage");

        questions.add("A snail is at the bottom of a 20-foot well. Each day, it climbs up 3 feet, but at night, it slips back 2 feet. How many days will it take for the snail to reach the top of the well?");
        options.add("A) 10 days, B) 12 days, C) 15 days, D) 20 days");
        answers.add("B) 12 days");

        questions.add("You have 8 balls, and one of them is slightly heavier or lighter than the others. How many weighings on a balance scale do you need to find the heavier or lighter ball?");
        options.add("A) 2, B) 3, C) 4, D) 5");
        answers.add("B) 3");

        questions.add("A woman has two coins that add up to 30 cents. One coin is not a nickel. What are the two coins?");
        options.add("A) Quarter and nickel, B) Dime and twenty-cent piece, C) Nickel and quarter, D) Half-dollar and twenty-cent piece");
        answers.add("B) Dime and twenty-cent piece");

        questions.add("You are in a room with three light switches. Each switch corresponds to one of three light bulbs in a room. Each light bulb is either on or off. You can't see the light bulbs from where you are, but you can turn the switches on and off as many times as you want. How many times do you need to toggle the switches to figure out which switch controls which light bulb?");
        options.add("A) 3, B) 4, C) 5, D) 6");
        answers.add("B) 4");

        questions.add("A farmer has 100 feet of fencing and wants to enclose a rectangular area with an existing barn as one side. If the barn is 30 feet wide, what is the maximum area he can enclose?");
        options.add("A) 1500 sq ft, B) 2000 sq ft, C) 2500 sq ft, D) 3000 sq ft");
        answers.add("C) 2500 sq ft");

        questions.add("You have five houses, each painted a different color (blue, green, red, white, and yellow). Each house is occupied by a person of a different nationality (American, British, Canadian, Indian, and Japanese). Each person has a different favorite drink (coffee, tea, milk, soda, and water). Using the following clues, can you determine the color of each house, the nationality of its occupant, and their favorite drink?");
        options.add("A) Yes, B) No");
        answers.add("A) Yes");
        
        questions.add("A container has 10 liters of a solution that is 20% salt. How much pure water should be added to make the solution 10% salt?");
        options.add("A) 5 liters, B) 10 liters, C) 15 liters, D) 20 liters");
        answers.add("B) 10 liters");

        questions.add("A bridge will collapse if more than 50 people stand on it. If each person weighs an average of 70 kg, what is the maximum total weight that the bridge can support?");
        options.add("A) 3500 kg, B) 4000 kg, C) 4500 kg, D) 5000 kg");
        answers.add("A) 3500 kg");

        questions.add("A plane crashes on the border of the United States and Canada. Where do they bury the survivors?");
        options.add("A) In the United States, B) In Canada, C) On the border, D) They don't bury survivors");
        answers.add("D) They don't bury survivors");

        questions.add("You are standing in a room with three doors. Behind one door is a beautiful palace, behind the second door is a fire-breathing dragon, and behind the third door is a room filled with gold. However, the doors are labeled incorrectly. How many doors do you need to open to figure out which door leads to which destination?");
        options.add("A) 1, B) 2, C) 3, D) 4");
        answers.add("B) 2");

        questions.add("A woman shoots her husband and then holds him underwater for five minutes. Next, she hangs him. But five minutes later, he is alive and well. What happened?");
        options.add("A) She was a photographer, B) She was a movie director, C) She was a magician, D) She was a doctor");
        answers.add("A) She was a photographer");
        
        questions.add("A train travels from City A to City B at an average speed of 60 mph. On the return trip, the train travels at an average speed of 40 mph. What is the average speed for the entire trip?");
        options.add("A) 48 mph, B) 50 mph, C) 52 mph, D) 55 mph");
        answers.add("A) 48 mph");

        questions.add("A bicycle racer is traveling at a speed of 25 mph. If he travels for 2 hours, how far does he go? If he then returns along the same route at a speed of 20 mph, how long does it take him to return?");
        options.add("A) 50 miles 2.5 hours, B) 60 miles 3 hours, C) 70 miles 3.5 hours, D) 80 miles 4 hours");
        answers.add("A) 50 miles 2.5 hours");

        questions.add("A company has three machines that produce identical widgets. Machine A produces 100 widgets per hour, Machine B produces 120 widgets per hour, and Machine C produces 150 widgets per hour. If the company needs to produce 360 widgets per hour, how many machines does it need to run?");
        options.add("A) 1, B) 2, C) 3, D) 4");
        answers.add("B) 2");

        questions.add("A person has two ropes that each take 30 minutes to burn from one end to the other. However, the ropes do not burn at a consistent rate and may change speed at any time. How can the person use these ropes to measure out exactly 15 minutes?");
        options.add("A) Light one rope at both ends, B) Light one rope at one end and the other rope at both ends, C) Light both ropes at one end, D) Light both ropes at both ends");
        answers.add("B) Light one rope at one end and the other rope at both ends");

        questions.add("A bat and a ball together cost $1.20. The bat costs $1.00 more than the ball. How much does the ball cost?");
        options.add("A) $0.05, B) $0.10, C) $0.15, D) $0.20");
        answers.add("B) $0.10");
        
        questions.add("A car travels from City A to City B at an average speed of 40 mph. On the return trip, the car travels at an average speed of 60 mph. What is the average speed for the entire trip?");
        options.add("A) 48 mph, B) 50 mph, C) 52 mph, D) 55 mph");
        answers.add("A) 48 mph");

        questions.add("A water tank can hold 300 gallons of water. If 120 gallons are already in the tank, how much more water can be added?");
        options.add("A) 120 gallons, B) 150 gallons, C) 180 gallons, D) 200 gallons");
        answers.add("C) 180 gallons");

        questions.add("A person has three boxes of different sizes. Box A can hold 12 apples, Box B can hold 15 apples, and Box C can hold 20 apples. If the person has 45 apples, how many boxes are needed to hold all the apples?");
        options.add("A) 1, B) 2, C) 3, D) 4");
        answers.add("C) 3");

        questions.add("A bicycle racer is traveling at a speed of 30 mph. If he travels for 3 hours, how far does he go? If he then returns along the same route at a speed of 25 mph, how long does it take him to return?");
        options.add("A) 90 miles 3.6 hours, B) 100 miles 4 hours, C) 110 miles 4.4 hours, D) 120 miles 5 hours");
        answers.add("A) 90 miles 3.6 hours");

        questions.add("A company has two machines that produce identical widgets. Machine A produces 80 widgets per hour, and Machine B produces 100 widgets per hour. If the company needs to produce 210 widgets per hour, how many machines does it need to run?");
        options.add("A) 1, B) 2, C) 3, D) 4");
        answers.add("B) 2");

        questions.add("A person has two ropes that each take 45 minutes to burn from one end to the other. However, the ropes do not burn at a consistent rate and may change speed at any time. How can the person use these ropes to measure out exactly 20 minutes?");
        options.add("A) Light one rope at both ends, B) Light one rope at one end and the other rope at both ends, C) Light both ropes at one end, D) Light both ropes at both ends");
        answers.add("B) Light one rope at one end and the other rope at both ends");
        
        questions.add("What is the next number in the series: 2, 5, 8, 11, 14?");
        options.add("A) 17, B) 18, C) 19, D) 20");
        answers.add("A) 17");

        questions.add("Which of the following patterns comes next: △, ▽, △, ▽, △?");
        options.add("A) ▽, B) △, C) ◆, D) ◇");
        answers.add("A) ▽");

        questions.add("What is the missing number in the series: 1, 2, 4, 7, 11, _?");
        options.add("A) 14, B) 15, C) 16, D) 17");
        answers.add("B) 15");

        questions.add("Which of the following logic sequences is correct: A, C, E, G, _?");
        options.add("A) H, B) I, C) J, D) K");
        answers.add("A) H");
        
        questions.add("Which of the following number sequences is correct: 2, 6, 12, 20, _?");
        options.add("A) 28, B) 30, C) 32, D) 34");
        answers.add("C) 32");

        questions.add("What is the missing number in the series: 3, 6, 9, 12, 15, _?");
        options.add("A) 18, B) 19, C) 20, D) 21");
        answers.add("A) 18");

        questions.add("Which of the following logic sequences is correct: 1, 2, 4, 8, _?");
        options.add("A) 12, B) 14, C) 16, D) 18");
        answers.add("C) 16");

        questions.add("What is the next number in the series: 1, 4, 9, 16, 25, _?");
        options.add("A) 36, B) 37, C) 38, D) 39");
        answers.add("A) 36");
        
        questions.add("A store sells two types of candy bars: A and B. Candy bar A costs $1.50, and candy bar B costs $2.00. If a customer buys 3 candy bars and spends exactly $5.00, how many of each type of candy bar did they buy?");
        options.add("A) 1 of A and 2 of B, B) 2 of A and 1 of B, C) 3 of A and 0 of B, D) 0 of A and 3 of B");
        answers.add("B) 2 of A and 1 of B");

        questions.add("A train leaves a station at 7:00 AM traveling at a constant speed of 60 mph. Another train leaves the same station at 9:00 AM traveling at 80 mph in the same direction. At what time will the second train catch up to the first train?");
        options.add("A) 10:00 AM, B) 11:00 AM, C) 12:00 PM, D) 1:00 PM");
        answers.add("C) 12:00 PM");

        questions.add("A person is climbing a staircase with 10 steps. They can either take one step or two steps at a time. How many different ways can they reach the top of the staircase?");
        options.add("A) 45, B) 55, C) 89, D) 144");
        answers.add("C) 89");

        questions.add("A farm has chickens and cows. There are 24 heads and 70 legs. How many chickens and how many cows are there?");
        options.add("A) 12 chickens and 12 cows, B) 10 chickens and 14 cows, C) 14 chickens and 10 cows, D) 16 chickens and 8 cows");
        answers.add("C) 14 chickens and 10 cows");

        questions.add("A pool is being filled by two pipes. Pipe A can fill the pool in 3 hours, and Pipe B can fill it in 6 hours. How long will it take to fill the pool if both pipes are used together?");
        options.add("A) 1 hour, B) 1.5 hours, C) 2 hours, D) 2.5 hours");
        answers.add("B) 1.5 hours");

        questions.add("A man has 7 pairs of black socks and 7 pairs of white socks in a drawer. He randomly pulls out one sock at a time without looking. How many socks must he pull out to be sure of having a matching pair?");
        options.add("A) 3, B) 4, C) 5, D) 7");
        answers.add("A) 3");

        questions.add("A clock shows the time as 3:15. What is the angle between the hour and the minute hands?");
        options.add("A) 0 degrees, B) 7.5 degrees, C) 15 degrees, D) 22.5 degrees");
        answers.add("D) 22.5 degrees");

	
        
    }
    

    public static void main(String[]args){
        new Logics_Quiz(name).setVisible(true);
    }
    
}

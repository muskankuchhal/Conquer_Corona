package com.example.coronaapp;

public class Global {

    public static int level;
    public static int score=0;
    public static String[] level_des = {
            "In this level, you will be tested for your knowledge of daily DO's and DON'Ts during Epidemic. Select YES if you agree with the statement, and NO if you don't",
            "In this level, you will be tested for your knowledge about Symptoms of COVID. Select YES if you agree with the statement, and NO if you don't",
            "In this level, you will be tested for your knowledge some of the do's and dont's if show some of the symptoms. Select YES if you agree with the statement, and NO if you don't",
    };

    // Level 1
    public static int q_index;
    public static boolean yes_no;
    public static int[] truth = {1, 0, 1, 1, 0, 0, 0, 1, 0, 0};
    public static String[] questions = {
            "Using masks is necessary",
            "Go out if you feel bored",
            "Maintaining proper distance and avoid physical contact",
            "Washing hands frequently/Using hand sanitizers",
            "Discouraging others who are following precautionary measures",
            "Hiding Potential Patients",
            "Taking unprescribed medicines",
            "Helping others",
            "Trusting and spreading unveried whatsapp forwards",
            "Attending Social Gatherings"
    };
    public static String[] yes = {
            "Oh,yes,yes!!!\n Don't step out of the house without them.",
            "Good job!!\n Spend time with your family and enjoy peace.",
            "Nice!!\nYou seem wise. ",
            "Yeah!!\nFollow that diligently.",
            "Dude!!\nYou can be a great asset,encourage others to follow precautions.",
            "You are amazing!!\nHelp the government which in turn would be a help to the society.",
            "Yes!!\nfollow doctor's prescription carefully.",
            "You doing a great service to the society.\nKeep it up!!",
            "Amazing!!\n",
            "Bravo!!\nYou are definitely an aware citizen of the nation "
    };
    public static String[] no = {
            "Using masks is necessary or You might be exposed to the virus.",
            "Don't step out!You may play inside the house,enjoy your meal or surf the internet.",
            "Don't fall prey for it! You may talk to your friends via phone.",
            "You need to be more aware.Keeping clean is of utmost importance.",
            "Instead encourage people to follow precautions.Follow them yourself too. ",
            "You are committing a crime. You must help government recognise patients,it would be benficial to all.",
            "Don't take unprescribed medicines.Consult your doctor.",
            "Try and help as much as you can. Contribute to the PM's relief fund.",
            "Be sensible!!It is even more dangerous than the virus itself.",
            "This way you won't be able to make it. Kindly get serious about the situation. "
    };
    //level 3

}

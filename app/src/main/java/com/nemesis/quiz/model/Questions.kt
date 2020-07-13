package com.nemesis.quiz.model



class Questions {

    companion object {
        val HISTORY = listOf(
            QuestionObject(
                "In what prison " +
                        "was Adolf Hitler held in 1924?", "Landsberg Prison",
                "Spandau Prison", "Ebrach Abbey", "Hohenasperg"
                , false
            ),
            QuestionObject(
                "What was found in 1946 by two young shepards near a cave?",
                "Dead Sea Scrolls", "The Blackbeard Chest", "Sheep"
                , "The First Oaxaca Cave Sleeper", false
            )
            , QuestionObject(
                "What is the name of the U.S. President was in office when the Gulf War began?",
                "George H. W. Bush", "Richard Nixon"
                , "George W. Bush", "Ronald Reagan", false
            ),
            QuestionObject(
                "In 1939, Britain and France declared war on Germany" +
                        " after it invaded which country?", "Poland", "Czechoslovakia"
                , "Austria", "Hungary", false
            ),

            QuestionObject(
                "In what year did the First World War end?" +
                        " after it invaded which country?", "1918", "1914"
                , "1916", "1912", false
            )
        )
        val GEOGRAPHY = listOf(
            QuestionObject(
                "What is the Polish city known to Germans as " +
                        "Danzig?", "Gdańsk", "Warsaw", "Zakopane",
                "Poznań", false
            ),
            QuestionObject(
                "Which UK country features a dragon on their flag?", "Wales"
                , "England", "North Ireland", "Scotland",
                false
            ),
            QuestionObject(
                "What is the largest country in the world?", "Russia",
                "Canada", "China", "USA", false
            ),
            QuestionObject(
                "Which country was NOT part of the Soviet Union?",
                "Romania", "Turkmenistan", "Belarus",
                "Tajikistan", false
            ),
            QuestionObject(
                "Which of the following is NOT a capital city?", "Sydney"
                , "Cairo", "Moscow", "Beijing", false
            )
        )
        val ARTS = listOf(
            QuestionObject(
                "What year was the Mona Lisa finished?",
                "1504",
                "1487",
                "1523",
                "1511",
                false
            ),
            QuestionObject(
                "Which of these are the name of a famous marker brand?",
                "Copic",
                "Dopix", "Cofix", "Marx", false
            ),
            QuestionObject(
                "Who painted the Sistine Chapel?", "Michelangelo",
                "Leonardo da Vinci",
                "Pablo Picasso", "Raphael", false
            ),
            QuestionObject(
                "What nationality was the surrealist painter Salvador Dali?",
                "Spanish", "Italian", "French",
                "Portuguese", false
            ),
            QuestionObject(
                "Who designed the Chupa Chups logo?", "Salvador Dali",
                "Pablo Picasso", "Andy Warhol",
                "Vincent van Gogh", false
            )
        )
        val MUSIC = listOf(
            QuestionObject(
                "Who is the lead singer of The Lumineers?",
                "Wesley Schultz",
                "Jeremiah Fraites",
                "Jay Van Dyke",
                "Neyla Pekarek",
                false
            ),
            QuestionObject(
                "Which rapper had an album that went double platinum with no features?",
                "J. Cole",
                "Kendrick Lamar",
                "Drake",
                "Big Sean",
                false
            ),
            QuestionObject(
                "How many members are there in the band Nirvana?",
                "Three",
                "Two",
                "Four",
                "Five",
                false
            ),
            QuestionObject(
                "Which of these Johns was murdered by gunshots outside the Dakota in New York in 1980?",
                "Bob Dylan",
                "Elvis",
                "Adele",
                "Billy Joel",
                false
            ),
            QuestionObject(
                "Who performed I Took A Pill In Ibiza?",
                "Mike Posner",
                "Avicii",
                "Robbie Williams",
                "Harry Styles",
                false
            )
        )
        val GENERAL_KNOWLEDGE = listOf(
            QuestionObject(
                "How many notes are there on a standard grand piano?",
                "88",
                "98",
                "108",
                "78",
                false
            ),
            QuestionObject(
                "What is the closest planet to our solar system sun?",
                "Mercury",
                "Mars",
                "Jupiter",
                "Earth",
                false
            ),
            QuestionObject(
                "Who is the author of Jurrasic Park?",
                "Michael Crichton",
                "Peter Benchley",
                "Chuck Paluhniuk",
                "Irvine Welsh",
                false
            ),
            QuestionObject(
                "Which one of these Swedish companies was founded in 1943?",
                "IKEA",
                "H&M",
                "Lindex",
                "Clas Ohlson",
                false
            ),
            QuestionObject(
                "Whose greyscale face is on the kappa emoticon on Twitch?",
                "Josh DeSeno",
                "Justin DeSeno",
                "John DeSeno",
                "Jimmy DeSeno",
                false
            )
        )
        val SPORT = listOf(
            QuestionObject(
                "Who won the Champions League in 1999?",
                "Manchester United",
                "Barcelona",
                "Bayern Munich",
                "Liverpool",
                false
            ),
            QuestionObject(
                "Which year did Jenson Button won his first ever Formula One World Drivers Championship?",
                "2009",
                "2010",
                "2007",
                "2006",
                false
            ),
            QuestionObject(
                "Where was the Games of the XXII Olympiad held?",
                "Moscow",
                "Barcelona",
                "Tokyo",
                "Los Angeles",
                false
            ),
            QuestionObject(
                "What national team won the 2016 edition of UEFA European Championship?",
                "Portugal",
                "France",
                "Germany",
                "England",
                false
            ),
            QuestionObject(
                "Who won the 2015 Formula 1 World Championship?",
                "Lewis Hamilton",
                "Nico Rosberg",
                "Sebastian Vettel",
                "Jenson Button",
                false
            )
        )

        val SCIENCE = listOf(
            QuestionObject(
                "Which of these names was an actual codename for a cancelled Microsoft project?",
                "Neptune",
                "Enceladus",
                "Pollux",
                "Saturn",
                false
            ),
            QuestionObject(
                "When did the CD begin to appear on the consumer market?",
                "1982",
                "1992",
                "1972",
                "1962",
                false
            ),
            QuestionObject(
                "When was the iPhone released?",
                "2007",
                "2005",
                "2006",
                "2004",
                false
            ),
            QuestionObject(
                "Which company developed the Hololens?",
                "Microsoft",
                "HTC",
                "Oculus",
                "Tobii",
                false
            ),
            QuestionObject(
                "Which buzzword did Apple Inc. use to describe their removal of the headphone jack?",
                "Courage",
                "Innovation",
                "Revolution",
                "Bravery",
                false
            )
        )
        val MYTHOLOGY = listOf(
            QuestionObject(
                "Hera is god of...?",
                "Marriage",
                "Agriculture",
                "Sea",
                "War", false
            ),
            QuestionObject(
                "Which of these Roman gods doesn't have a counterpart in Greek mythology?",
                "Janus",
                "Vulcan",
                "Juno",
                "Mars",
                false
            ),
            QuestionObject(
                "In Greek Mythology, who killed Achilles?",
                "Paris",
                "Hector",
                "Helen",
                "Pericles",
                false
            ),
            QuestionObject(
                "Which of the following is NOT a god in Norse Mythology?",
                "Jens",
                "Loki",
                "Tyr",
                "Snotra",
                false
            ),
            QuestionObject(
                "In Greek mythology, who is the god of wine?",
                "Dionysus",
                "Hephaestus",
                "Demeter",
                "Apollo",
                false
            )
        )
    }
}
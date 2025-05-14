 There are 3 ways to create reflection of java class.

            1. Class birdClass = Class.forName("Bird")

            2. Class birdClass = Bird.class;

            3. Bird birdObj = new Bird();
               Class birdClass = birdObj.getClass()

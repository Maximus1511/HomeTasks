package lesson4.lesson6;

    class Dog extends Animal {
        //Constructors
        private static int dogCounter;
        public Dog(){
        }

        public Dog(String name, int swimLimit, int runLimit) {
            this.name = name;
            this.swimLimit =  swimLimit;
            this.runLimit =  runLimit;
            //dogCounter =  dogCounter + 1;
            System.out.println("Dog " + this.name + " was created. Dog number is: " + incrAnimalCounter());
        }

        //Overriden methods
        private void setDistance(int distance){
            this.distance =  distance;
        }

        private int getDistance(){
            return this.distance;
        }


        @Override
        protected void getRunLimit(){
            System.out.printf("%s: My run limit is %s meters%n",this.name, this.runLimit);
        }

        @Override
        protected void setRunLimit(int runLimit){
            System.out.printf("%s's run limit changed to %d meters%n", name, runLimit);
            this.runLimit =  runLimit;
        }

        @Override
        public void getSwimLimit() {
            System.out.printf("%s: My swim limit is %s meters%n",this.name, this.swimLimit);
        }

        @Override
        public void setSwimLimit(int swimLimit) {
            System.out.printf("%s's swim limit changed to %d meters%n", name, swimLimit);
            this.swimLimit =  swimLimit;
        }

        @Override
        protected void run(int distance) {
        if (distance > runLimit){
            System.out.printf("%s can't run %d meters.%n", name, distance);
            getRunLimit();
        }
        else {
            System.out.printf("%s has already run %d meters%n", name, distance);
        }
        }

        @Override
        protected void swim(int distance) {
            if (distance > swimLimit){
                System.out.printf("%s can't swim %d meters.%n", name, distance);
                getSwimLimit();
            }
            else {
                System.out.printf("%s has already swum %d meters%n", name, distance);
            }
        }

        @Override
        protected int incrAnimalCounter(){
            super.incrAnimalCounter();
            dogCounter =  dogCounter + 1;
            return (dogCounter);
        }
    }

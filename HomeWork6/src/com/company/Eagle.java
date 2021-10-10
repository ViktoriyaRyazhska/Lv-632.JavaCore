package com.company;


    public class Eagle extends FlyingBird{
        protected EagleColor color;

        public Eagle() {
            this.color = EagleColor.NONE;
        }

        public Eagle(EagleColor color) {
            super();
            this.color = color;
        }

        public Eagle(String feathers, float wingsWidth) {
            super(feathers, wingsWidth);
            this.color = EagleColor.NONE;
        }

        public Eagle(String feathers, float wingsWidth, EagleColor color) {
            super(feathers, wingsWidth);
            this.color = color;
        }

        public EagleColor getColor() {
            return color;
        }

        public void setColor(EagleColor color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return feathers + ", " +
                    wingsWidth + ", " +
                    color.getColor();
        }

        @Override
        public void fly() {
            System.out.println("The eagle is flying");
        }

        public enum EagleColor{
            BROWN("Brown"),
            DARK("Dark"),
            BLACK("Black"),
            GRAY("Gray"),
            NONE("NONE");

            private String color;

            EagleColor(String color) {
                this.color = color;
            }

            public String getColor() {
                return color;
            }
        }
    }


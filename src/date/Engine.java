package date;

public class Engine {
        private int horsePower;
        private int mileage;
        private int weight;

        protected Engine(int horsePower, int mileage, int weight) {
                this.horsePower = horsePower;
                this.mileage = mileage;
                this.weight = weight;
        }
        public Engine(Engine engine){
                super();
                this.horsePower = engine.horsePower;
                this.mileage = engine.mileage;
                this.weight = engine.weight;
        }
        protected Engine(){}

        public int getHorsePower() {
                return horsePower;
        }

        public int getMileage() {
                return mileage;
        }

        public int getWeight() {
                return weight;
        }

        public void setHorsePower(int horsePower) {
                this.horsePower = horsePower;
        }

        public void setMileage(int mileage) {
                this.mileage = mileage;
        }

        public void setWeight(int weight) {
                this.weight = weight;
        }

        @Override
        public String toString() {
                return "Engine{" +
                        "horsePower=" + horsePower +
                        ", mileage=" + mileage +
                        ", weight=" + weight +
                        '}';
        }
}

package Simulation.DefaultClasses;

public enum Material {
    GLASS {
        @Override
        public String getName() {
            return "Окно";
        }
    },
    WOOD {
        @Override
        public String getName() {
            return "Деревянная стена";
        }
    },
    INTERIOR_WALL {
        @Override
        public String getName() {
            return "Межкомнатная стена";
        }
    },
    STRUCTURAL_WALL {
        @Override
        public String getName() {
            return "Несущая стена";
        }
    };

    public abstract String getName();
}

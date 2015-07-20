package calc;

public enum Operation implements Callable
{
    ADD
    {
        @Override
        public double call(int a, int b) 
        {
            return a + b;
        }
    },
    SUB
    {
        @Override
        public double call(int a, int b) 
        {
            return a - b;
        }
    },
    DIV
    {
        @Override
        public double call(int a, int b) 
        {
            return a*1.0 / b;
        }
    },
    MUL
    {
        @Override
        public double call(int a, int b) 
        {
            return a * b;
        }
    };   
}

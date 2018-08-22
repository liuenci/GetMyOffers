package com.cier.base.jicheng;

public class Test1 {
    static class A {
        protected int value;

        public A(int v) {
            setValue(v);
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getValue() {
            try {
                value++;
                return value;
            } catch (Exception e) {
                System.out.println(e.toString());
            } finally {
                this.setValue(value);
                System.out.println(value);
            }
            return value;
        }
    }

    static class B extends A {
        public B() {
            super(5);
            setValue(getValue() - 3);
        }

        /**
         * 因为 B 重写了 A 的 set 方法所以执行的是 B 的方法
         * @param value
         */
        public void setValue(int value) {
            super.setValue(2 * value);
        }
    }

    public static void main(String[] args) {
        // 22 34 17
        System.out.println(new B().getValue());
    }
}

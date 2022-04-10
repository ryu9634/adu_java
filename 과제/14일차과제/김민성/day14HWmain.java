public class day14HWmain {
    public static void main(String[] args) {

        package day14HWmain;

        public class HomeWork_main {
            public static void main(String[] args) {
                Mask mask = new Mask();
                MaskProduct maskProduct = new MaskProduct(mask);
                Customer customer = new Customer(mask);

                maskProduct.start();
                customer.start();
            }
        }


    }
}

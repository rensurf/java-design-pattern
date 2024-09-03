package delegation;

import extend.Banner;

public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithAster();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}

package guru.springframework.sfgdi.examplebean;

import org.springframework.context.annotation.Primary;


public class TestProfile {

    private String profile;

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "TestProfile{" +
                "profile='" + profile + '\'' +
                '}';
    }
}

package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"cat", "default"})
@Service("pet")
public class CatPetService implements PetService{
    @Override
    public String whichPetIsTheBest() {
        return "Cats are the best";
    }
}

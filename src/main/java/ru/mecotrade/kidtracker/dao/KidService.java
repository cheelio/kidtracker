package ru.mecotrade.kidtracker.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mecotrade.kidtracker.dao.model.User;

import java.util.Collection;

@Service
public class KidService {

    @Autowired
    private KidRepository kidRepository;

    public Collection<User> users(String deviceId) {
        return kidRepository.findUsersByDeviceId(deviceId);
    }
}

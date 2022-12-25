package com.example.ex00.prac;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Getter
@ToString
@Qualifier("gs25")
public class Gs25 implements Store{
    public int kimbapPrice = Store.kombapPrice - 500;

    @Override
    public boolean useTable() {
        return false;
    }
}

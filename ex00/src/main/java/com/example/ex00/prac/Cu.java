package com.example.ex00.prac;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Getter
@ToString
@Qualifier("cu") @Primary
public class Cu implements Store{
    public int kimbapPrice = Store.kombapPrice + 500;

    @Override
    public boolean useTable() {
        return true;
    }
}

package com.example.webapp.service.impl;

import com.example.webapp.entity.Poem;
import com.example.webapp.repository.PoemMapper;
import com.example.webapp.service.PoemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PoemServiceImpl implements PoemService {

    /** DI */
    private final PoemMapper toPoemMapper;

    @Override
    public List<Poem> findAllPoem() {
        return toPoemMapper.selectAllPoem();
    }

    @Override
    public Poem findPoemById(Integer id) {
        return toPoemMapper.selectPoemById(id);
    }

    @Override
    public void insertPoem(Poem poem) {
        toPoemMapper.insertPoem(poem);
    }

    @Override
    public void updatePoem(Poem poem) {
        toPoemMapper.updatePoem(poem);
    }

    @Override
    public void deletePoem(Integer id) {
        toPoemMapper.deletePoem(id);
    }
}

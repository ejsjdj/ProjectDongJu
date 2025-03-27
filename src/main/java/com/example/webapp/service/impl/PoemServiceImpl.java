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
    private final PoemMapper poemMapper;

    @Override
    public List<Poem> findAllPoem() {
        return poemMapper.selectAllPoem();
    }

    @Override
    public Poem findPoemById(Integer id) {
        return poemMapper.selectPoemById(id);
    }

    @Override
    public void insertPoem(Poem poem) {
        poemMapper.insertPoem(poem);
    }

    @Override
    public void updatePoem(Poem poem) {
        poemMapper.updatePoem(poem);
    }

    @Override
    public void deletePoem(Integer id) {
        poemMapper.deletePoem(id);
    }
}

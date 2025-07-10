package com.prueba_1.service;

import com.prueba_1.dao.RevisionDao;
import com.prueba_1.domain.Revision;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RevisionServiceImpl implements RevisionService {

    @Autowired
    private RevisionDao revisionDao;

    @Override
    @Transactional(readOnly = true)
    public List<Revision> getRevisiones(boolean activos) {
        var lista = revisionDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Revision getRevision(Revision revision) {
        return revisionDao.findById(revision.getIdRevision()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Revision revision) {
        revisionDao.save(revision);
    }

    @Override
    @Transactional
    public void delete(Revision revision) {
        revisionDao.delete(revision);
    }
}

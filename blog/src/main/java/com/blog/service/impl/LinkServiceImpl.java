package com.blog.service.impl;

import com.blog.entity.Link;
import com.blog.mapper.LinkMapper;
import com.blog.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dell on 2020/11/27.
 */
@Service
public class LinkServiceImpl implements LinkService {

    @Autowired
    private LinkMapper linkMapper;

    @Override
    public Integer countLink(Integer status)  {
        return linkMapper.countLink(status);
    }

    @Override
    public List<Link> listLink(Integer status)  {
        return linkMapper.listLink(status);
    }

    @Override
    public void insertLink(Link link)  {
        linkMapper.insert(link);
    }

    @Override
    public void deleteLink(Integer id)  {
        linkMapper.deleteById(id);
    }

    @Override
    public void updateLink(Link link)  {
        linkMapper.update(link);
    }

    @Override
    public Link getLinkById(Integer id)  {
        return linkMapper.getLinkById(id);
    }

}

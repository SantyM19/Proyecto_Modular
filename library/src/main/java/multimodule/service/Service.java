package multimodule.service;

import multimodule.domain.Library;
import multimodule.domain.LibraryDTO;
import multimodule.domain.LibraryMapper;
import multimodule.domain.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.webservices.WebServicesProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@org.springframework.stereotype.Service
@EnableConfigurationProperties(WebServicesProperties.class)
public class Service {
    @Autowired
    LibraryRepository libraryRepository;
    LibraryMapper libraryMapper = new LibraryMapper();

    public LibraryDTO createlibrary(LibraryDTO libraryDTO){
        Library library = libraryMapper.fromDTO(libraryDTO);
        return libraryMapper.fromModel(libraryRepository.save(library));
    }
}

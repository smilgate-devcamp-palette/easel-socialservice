package org.palette.easelsocialservice.persistence.relationship;

import lombok.Getter;
import org.palette.easelsocialservice.persistence.domain.Paint;
import org.springframework.data.neo4j.core.schema.RelationshipId;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

@RelationshipProperties
public class Replies {

    @RelationshipId
    private Long id;

    @TargetNode
    @Getter
    private Paint paint;

    public Replies(Paint paint) {
        this.paint = paint;
    }
}

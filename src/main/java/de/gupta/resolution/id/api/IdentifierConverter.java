package de.gupta.resolution.id.api;

import java.util.Optional;

@FunctionalInterface
public interface IdentifierConverter<SourceID, TargetID>
{
	Optional<TargetID> convert(SourceID id);
}